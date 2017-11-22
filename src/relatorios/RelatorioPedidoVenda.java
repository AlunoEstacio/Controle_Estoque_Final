package relatorios;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import modelo.Funcionario;
import modelo.PedidoVProduto;
import modelo.Relatorio;
import util.ObterNomeMaquina;
import util.ValidarData;

public class RelatorioPedidoVenda {
    
    public static void gerarPdf(List<PedidoVProduto> pedidos, Relatorio relatorio){
            Document doc = new Document();
            Date dataAtual = new Date();
            DateFormat formatoDataBrasil;
            String maquina = ObterNomeMaquina.usuario();
            String nomeRelatorio = relatorio.getNome()+"_"+dataAtual.getTime();
            
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\"+maquina+
                        "\\Desktop\\RelatoriosCeE\\"+nomeRelatorio+".pdf"));
                
                doc.open();
                Font f2 = new Font(FontFamily.TIMES_ROMAN, 14);
                Font f1 = new Font(FontFamily.TIMES_ROMAN, 9);
                
                Locale BRAZIL = new Locale("pt","BR");
                formatoDataBrasil = DateFormat.getDateInstance(DateFormat.LONG, BRAZIL);
                String horaSolicitacao = Integer.toString(dataAtual.getHours())+":"+Integer.toString(dataAtual.getMinutes());
                
                Paragraph CabecalhoLinha1 = new Paragraph("Relatório de Pedido de Venda\n\n", f2);
                CabecalhoLinha1.setAlignment(Element.ALIGN_CENTER);
                
                Paragraph CabecalhoLinha2 = new Paragraph("Solicitado por....."+
                        "\nFuncionário: "+relatorio.getFuncionarioSolicitante().getNome()
                        +"\nCargo: "+relatorio.getFuncionarioSolicitante().getCargo()
                        +"\nCPF : "+relatorio.getFuncionarioSolicitante().getCpf()
                        +"\nPeríodo da solicitação : "+relatorio.getDataInicio()+
                        " a "+relatorio.getDataFinal()
                        +"\nData da solicitação : "+formatoDataBrasil.format(dataAtual)+" às "+horaSolicitacao, f1);
                
                Paragraph CabecalhoLinha3 = new Paragraph("\n\nPedidos de compra cadastrados no sistema\n", f1);
                
                Paragraph CabecalhoLinha4 = new Paragraph("Total de pedidos cadastros no sistema dentro do período : "
                        +pedidos.size()+"\n\n", f1);
                
                doc.add(CabecalhoLinha1);
                doc.add(CabecalhoLinha2);
                doc.add(CabecalhoLinha3);              
                doc.add(CabecalhoLinha4);
                
                for(PedidoVProduto pedido : pedidos){
                    PdfPTable table = new PdfPTable(2);
                    table.setTotalWidth(520);
                    table.setLockedWidth(true);
                    
                    BigDecimal totalRecebidoPeloPedido = valorTotalRecebidoPeloPedido(pedido);
                    BigDecimal valorDoLucroDoPedido = calcularValorDoLucroDoPedido(pedido);
                    String dataPedido = dataPedidoVenda(pedido.getId_pedido().getData_pedido().toString());
                    
                    PdfPCell coluna1 = new PdfPCell(new Paragraph("Nome : "+ pedido.getId_pedido().getNome(), f1));                   
                    coluna1.setBorder(PdfPCell.BOTTOM);
                    coluna1.setColspan(2);
                                      
                    PdfPCell coluna2 = new PdfPCell(new Paragraph("Código de registro : "+pedido.getId_pedido().getId(), f1));
                    coluna2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna3 = new PdfPCell(new Paragraph("Cliente : "+pedido.getId_pedido().getCliente_id().getNome(), f1));
                    coluna3.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna4 = new PdfPCell(new Paragraph("Quantidade de produtos : "+pedido.getQuantidadeProduto(), f1));
                    coluna4.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna5 = new PdfPCell(new Paragraph("Produto : "+pedido.getId_produto().getNome(), f1));
                    coluna5.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna6 = new PdfPCell(new Paragraph("Valor total recebido pelo venda : R$"+totalRecebidoPeloPedido, f1));
                    coluna6.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna7 = new PdfPCell(new Paragraph("Data da venda : "+dataPedido, f1));
                    coluna7.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna8 = new PdfPCell(new Paragraph("Preço de venda do produto: R$"+pedido.getId_produto().
                            getPrecoVenda(), f1));
                    coluna8.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna9 = new PdfPCell(new Paragraph("Valor total do lucro da venda : R$"+valorDoLucroDoPedido, f1));
                    coluna9.setBorder(PdfPCell.NO_BORDER);
                    
                    PdfPCell colunaS1 = new PdfPCell(new Paragraph(" "));
                    colunaS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell colunaS2 = new PdfPCell(new Paragraph(" "));
                    colunaS2.setBorder(PdfPCell.NO_BORDER);
                
                    table.addCell(coluna1);
                    table.addCell(coluna2);
                    table.addCell(coluna3);
                    table.addCell(coluna4);
                    table.addCell(coluna5);
                    table.addCell(coluna6);
                    table.addCell(coluna7);
                    table.addCell(coluna8);    
                    table.addCell(coluna9);
                    
                    table.addCell(colunaS1);
                    table.addCell(colunaS2);      
                    
                    doc.add(table);
                    
                }               
                
            } catch (FileNotFoundException ex) {
                System.out.print("Erro "+ex);
            } catch (DocumentException ex) {
                System.out.print("Erro "+ex);
            }
            doc.close();
        }
    
    private static BigDecimal valorTotalRecebidoPeloPedido(PedidoVProduto ped) {
        BigDecimal valorTotalPedidos = new BigDecimal(0);
        BigDecimal qtdProdutos = new BigDecimal(ped.getQuantidadeProduto());
        valorTotalPedidos =  qtdProdutos.multiply(ped.getId_produto().getPrecoVenda());
        return valorTotalPedidos;
    }
    
    private static BigDecimal calcularValorDoLucroDoPedido(PedidoVProduto ped){
        BigDecimal valorTotalGastoNoPedidos = new BigDecimal(0);
        BigDecimal valorTotalRecebidoNoPedidos = new BigDecimal(0);
        BigDecimal valorTotalDoLucro = new BigDecimal(0);
        BigDecimal qtdProdutos = new BigDecimal(ped.getQuantidadeProduto());
        
        valorTotalGastoNoPedidos =  qtdProdutos.multiply(ped.getId_produto().getPrecoCompra());
        valorTotalRecebidoNoPedidos = qtdProdutos.multiply(ped.getId_produto().getPrecoVenda());
        
        valorTotalDoLucro = valorTotalRecebidoNoPedidos.subtract(valorTotalGastoNoPedidos);
        
        return valorTotalDoLucro;
    }
    
    private static String dataPedidoVenda(String data){
        String dataPedido = ValidarData.converterDataParaFormatoDaMascara(data);
        return dataPedido;
    }
    
}
