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
import controle.ControlePedidoVenda;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import modelo.Cliente;
import modelo.FuncionarioLogado;
import modelo.PedidoVProduto;
import modelo.Relatorio;
import util.ObterNomeMaquina;
import util.ValidarData;

public class RelatorioCliente {
    
    public static void gerarPdf(List<Cliente> cliente, Relatorio relatorio){
            Document doc = new Document();
            ControlePedidoVenda controlePedidoVenda = new ControlePedidoVenda();
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
                
                Paragraph CabecalhoLinha1 = new Paragraph("Relatório de Cliente\n\n", f2);
                CabecalhoLinha1.setAlignment(Element.ALIGN_CENTER);
                
                Paragraph CabecalhoLinha2 = new Paragraph("Solicitado por....."+
                        "\nFuncionário: "+relatorio.getFuncionarioSolicitante().getNome()
                        +"\nCargo: "+relatorio.getFuncionarioSolicitante().getCargo()
                        +"\nCPF : "+relatorio.getFuncionarioSolicitante().getCpf()
                        +"\nData da solicitação : "+formatoDataBrasil.format(dataAtual)+" às "+horaSolicitacao, f1);
                
                Paragraph CabecalhoLinha3 = new Paragraph("\n\nClientes cadastrados no sistema\n", f1);
                
                Paragraph CabecalhoLinha4 = new Paragraph("Total de clientes cadastros no sistema : "+cliente.size()+"\n\n", f1);
                
                doc.add(CabecalhoLinha1);
                doc.add(CabecalhoLinha2);
                doc.add(CabecalhoLinha3);              
                doc.add(CabecalhoLinha4);
                
                for(Cliente cli : cliente){
                    PdfPTable table = new PdfPTable(2);
                    table.setTotalWidth(520);
                    table.setLockedWidth(true);
                    
                    List<PedidoVProduto> pedidosCliente = controlePedidoVenda.selecionarPedidosVendaPorClienteId(cli.getId());
                    
                    BigDecimal valorTotalPedidos = calcularValorTotalDePedido(pedidosCliente);
                    Integer qdtProdutosSolicitados = calcularTotalDeProdutos(pedidosCliente);
                    String dataUltimoPedido = obterDataUltimoPedido(pedidosCliente);
                    String dataCadastroCliente = ValidarData.converterDataParaFormatoDaMascara(
                            cli.getDataCadastro().toString());
                    String statusCliente = obterStatusCliente(cli.getAtivo());
                    
                    PdfPCell coluna1 = new PdfPCell(new Paragraph("Nome : "+ cli.getNome(), f1));                   
                    coluna1.setBorder(PdfPCell.BOTTOM);
                    coluna1.setColspan(2);
                                      
                    PdfPCell coluna2 = new PdfPCell(new Paragraph("Código de registro : "+cli.getId(), f1));
                    coluna2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna3 = new PdfPCell(new Paragraph("Email : "+cli.getEmail(), f1));
                    coluna3.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna4 = new PdfPCell(new Paragraph("CNPJ/CPF : "+cli.getNumeroRegistro(), f1));
                    coluna4.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna5 = new PdfPCell(new Paragraph("Cidade de origem : "+cli.getEndereco().getCidade(), f1));
                    coluna5.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna6 = new PdfPCell(new Paragraph("Entidade : "+cli.getTipoPessoa(), f1));
                    coluna6.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna7 = new PdfPCell(new Paragraph("Data de cadastro : "+dataCadastroCliente, f1));
                    coluna7.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna8 = new PdfPCell(new Paragraph("--Informacões sobre pedidos do cliente--",f1));
                    coluna8.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna9 = new PdfPCell(new Paragraph(" ", f1));
                    coluna9.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna10 = new PdfPCell(new Paragraph("Quantidade de pedidos solicitados : "+pedidosCliente.size() ,f1));
                    coluna10.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna11 = new PdfPCell(new Paragraph("Valor total dos pedidos : R$ "+valorTotalPedidos.toString(), f1));
                    coluna11.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna12 = new PdfPCell(new Paragraph("Quantidade total de produtos solicitados : "+qdtProdutosSolicitados, f1));
                    coluna12.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna13 = new PdfPCell(new Paragraph("Data de solicitação do último pedido : "+dataUltimoPedido, f1));
                    coluna13.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna14 = new PdfPCell(new Paragraph("Status cliente : "+statusCliente, f1));
                    coluna14.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna15 = new PdfPCell(new Paragraph(" ",f1));
                    coluna15.setBorder(PdfPCell.NO_BORDER);
                    
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
                    table.addCell(coluna14);
                    table.addCell(coluna15);
                    table.addCell(coluna8);
                    table.addCell(coluna9);
                    table.addCell(coluna10);
                    table.addCell(coluna11);
                    table.addCell(coluna12);
                    table.addCell(coluna13);
     
                    
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
    
    private static BigDecimal calcularValorTotalDePedido(List<PedidoVProduto> pedido) {
        BigDecimal valorTotalPedidos = new BigDecimal(0);
        for(PedidoVProduto pd : pedido){
            BigDecimal qtdProdutos = new BigDecimal(pd.getQuantidadeProduto());
            valorTotalPedidos =  valorTotalPedidos.add(qtdProdutos.multiply(pd.getId_produto().getPrecoVenda()));        
        }
        return valorTotalPedidos;
    }
    
    private static Integer calcularTotalDeProdutos(List<PedidoVProduto> pedido){
        Integer qtdProdutos = 0;
        for(PedidoVProduto pd : pedido){
            qtdProdutos = qtdProdutos + pd.getQuantidadeProduto();
        }
        return qtdProdutos;
    }
    
    private static String obterDataUltimoPedido(List<PedidoVProduto> pedido){
        if(!pedido.isEmpty()){
           PedidoVProduto ped = pedido.get(pedido.size()-1);
        
            if(ped.getId_pedido().getData_pedido() != null){
                String dataPedido = ValidarData.converterDataParaFormatoDaMascara(
                    ped.getId_pedido().getData_pedido().toString());
                return dataPedido;
            }else{
                return "Não contém";
            } 
        }else{
            return "Não contém";
        }
    }
    
    private static String obterStatusCliente(Integer status){
        if(status == 1){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }
    
}
