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
import controle.ControlePedidoCompra;
import controle.ControlePedidoVenda;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import modelo.Funcionario;
import modelo.PedidoCompra;
import modelo.PedidoVProduto;
import modelo.Produto;
import modelo.Relatorio;
import util.ObterNomeMaquina;
import util.ValidarData;

public class RelatorioProduto {
    
    public static void gerarPdf(List<Produto> produto, Relatorio relatorio){
            Document doc = new Document();
            Date dataAtual = new Date();
            DateFormat formatoDataBrasil;
            String maquina = ObterNomeMaquina.usuario();
            ControlePedidoCompra controlePedidoCompra = new ControlePedidoCompra();
            ControlePedidoVenda controlePedidoVenda = new ControlePedidoVenda();
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
                
                Paragraph CabecalhoLinha1 = new Paragraph("Relatório de Produto\n\n", f2);
                CabecalhoLinha1.setAlignment(Element.ALIGN_CENTER);
                
                Paragraph CabecalhoLinha2 = new Paragraph("Solicitado por....."+
                        "\nFuncionário: "+relatorio.getFuncionarioSolicitante().getNome()
                        +"\nCargo: "+relatorio.getFuncionarioSolicitante().getCargo()
                        +"\nCPF : "+relatorio.getFuncionarioSolicitante().getCpf()
                        +"\nData da solicitação : "+formatoDataBrasil.format(dataAtual)+" às "+horaSolicitacao, f1);
                
                Paragraph CabecalhoLinha3 = new Paragraph("\n\nProdutos cadastrados no sistema\n\n", f1);
                
                Paragraph CabecalhoLinha4 = new Paragraph("Total de produtos cadastrados no sistema : "+produto.size()
                        +"\n\n", f1);
                
                doc.add(CabecalhoLinha1);
                doc.add(CabecalhoLinha2);
                doc.add(CabecalhoLinha3);              
                doc.add(CabecalhoLinha4);
                
                for(Produto prod : produto){
                    PdfPTable table = new PdfPTable(2);
                    table.setTotalWidth(520);
                    table.setLockedWidth(true);
                    
                    List<PedidoCompra> pedidoCompraProduto = controlePedidoCompra.
                            selecionarTodosPedidosCompraPorIdProduto(prod.getId());
                    
                    List<PedidoVProduto> pedidosVendaProduto = controlePedidoVenda.
                            selecionarPedidosVendaPorProdutoId(prod.getId());
                    
                    BigDecimal valorTotalMonetarioProduto = calcularValorTotalEmDinheiroDoProduto(prod);
                    String dataCadastro = ValidarData.converterDataParaFormatoDaMascara(
                            prod.getDataCadastro().toString());
                    BigDecimal lucroGeradoPeloProduto = calcularLucroGeradoPeloProduto(prod);
                    Integer totalProdutosPedidoCompra = totalProdutosPedidoCompra(pedidoCompraProduto);
                    BigDecimal valorTotalGastoPedidoCompra = valorMonetarioTotalProdutosPedidoCompra(pedidoCompraProduto);
                    String dataUltimoPedidoCompra = obterDataUltimoPedidoCompra(pedidoCompraProduto);
                    
                    String dataUltimoPedidoVenda = obterDataUltimoPedidoVenda(pedidosVendaProduto);
                    Integer totalProdutosPedidoVenda = calcularTotalDeProdutosPedidoVenda(pedidosVendaProduto);
                    BigDecimal valorTotalPedidoVenda = calcularValorTotalDePedidoVenda(pedidosVendaProduto);
                    
                    PdfPCell coluna1 = new PdfPCell(new Paragraph("Nome : "+ prod.getNome(), f1));                   
                    coluna1.setBorder(PdfPCell.BOTTOM);
                    coluna1.setColspan(2);
                                      
                    PdfPCell coluna2 = new PdfPCell(new Paragraph("Código de registro : "+prod.getId(), f1));
                    coluna2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna3 = new PdfPCell(new Paragraph("Quantidade em estoque : "+prod.getQuantidade(), f1));
                    coluna3.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna4 = new PdfPCell(new Paragraph("Fornecedor : "+prod.getFornecedor().getNome(), f1));
                    coluna4.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna5 = new PdfPCell(new Paragraph("Categoria : "+prod.getCategoria(), f1));
                    coluna5.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna6 = new PdfPCell(new Paragraph("Marca : "+prod.getMarca(), f1));
                    coluna6.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna7 = new PdfPCell(new Paragraph("Data cadastro : "+dataCadastro, f1));
                    coluna7.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna8 = new PdfPCell(new Paragraph("Preço de venda : R$ "+prod.getPrecoVenda(), f1));
                    coluna8.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna9 = new PdfPCell(new Paragraph("Valor total em estoque : R$ "+valorTotalMonetarioProduto, f1));
                    coluna9.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna10 = new PdfPCell(new Paragraph("Preço de compra : R$ "+prod.getPrecoCompra(), f1));
                    coluna10.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna11 = new PdfPCell(new Paragraph("Lucro gerado pelo produto : R$ "+lucroGeradoPeloProduto,f1));
                    coluna11.setBorder(PdfPCell.NO_BORDER);
                    
                    PdfPCell coluna12 = new PdfPCell(new Paragraph("\n--Informações sobre Pedido de Compra do Produto--",f1));
                    coluna12.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna13 = new PdfPCell(new Paragraph(" ",f1));
                    coluna13.setBorder(PdfPCell.NO_BORDER);
                    
                    PdfPCell coluna14 = new PdfPCell(new Paragraph("Quantidade de pedidos : "+pedidoCompraProduto.size(), f1));
                    coluna14.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna15 = new PdfPCell(new Paragraph("Quantidade total de produtos solicitados : "+totalProdutosPedidoCompra, f1));
                    coluna15.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna16 = new PdfPCell(new Paragraph("Valor total gasto nos produtos : R$ "+valorTotalGastoPedidoCompra, f1));
                    coluna16.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna17 = new PdfPCell(new Paragraph("Data de solicitação do último pedido : "+dataUltimoPedidoCompra,f1));
                    coluna17.setBorder(PdfPCell.NO_BORDER);
                    
                    PdfPCell coluna18 = new PdfPCell(new Paragraph("\n--Informações sobre Pedido de Venda do Produto--",f1));
                    coluna18.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna19 = new PdfPCell(new Paragraph(" ",f1));
                    coluna19.setBorder(PdfPCell.NO_BORDER);
                    
                    PdfPCell coluna20 = new PdfPCell(new Paragraph("Quantidade de pedidos : "+pedidosVendaProduto.size() ,f1));
                    coluna20.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna21 = new PdfPCell(new Paragraph("Valor total recebido dos pedidos : R$ "+valorTotalPedidoVenda, f1));
                    coluna21.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna22 = new PdfPCell(new Paragraph("Quantidade total de produtos vendido : "+totalProdutosPedidoVenda, f1));
                    coluna22.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell coluna23 = new PdfPCell(new Paragraph("Data de solicitação do último pedido : "+dataUltimoPedidoVenda, f1));
                    coluna23.setBorder(PdfPCell.NO_BORDER);
                    
                    
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
                    table.addCell(coluna10);
                    table.addCell(coluna11);
                    table.addCell(coluna12);
                    table.addCell(coluna13);
                    table.addCell(coluna14);
                    table.addCell(coluna15);
                    table.addCell(coluna16);
                    table.addCell(coluna17);
                    table.addCell(coluna18);
                    table.addCell(coluna19);
                    table.addCell(coluna20);
                    table.addCell(coluna21);
                    table.addCell(coluna22);
                    table.addCell(coluna23);
                    
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
    
    private static BigDecimal calcularValorTotalEmDinheiroDoProduto(Produto prod) {
        BigDecimal valorTotal = new BigDecimal(0);
        
        BigDecimal qtdProdutos = new BigDecimal(prod.getQuantidade());
        valorTotal =  qtdProdutos.multiply(prod.getPrecoCompra());
        
        return valorTotal;
    }
    
    private static BigDecimal calcularLucroGeradoPeloProduto(Produto prod) {
        BigDecimal valorTotal = new BigDecimal(0);
        BigDecimal qtdProdutos = new BigDecimal(prod.getQuantidade());
        BigDecimal valorTotalPrecoCompra = new BigDecimal(0);
        BigDecimal valorTotalPrecoVenda = new BigDecimal(0);
        
        valorTotalPrecoCompra = qtdProdutos.multiply(prod.getPrecoCompra());
        valorTotalPrecoVenda = qtdProdutos.multiply(prod.getPrecoVenda());
        valorTotal = valorTotalPrecoVenda.subtract(valorTotalPrecoCompra);
        
        return valorTotal;
    }
    
    private static Integer totalProdutosPedidoCompra(List<PedidoCompra> pedidoCompraProduto){
        Integer totalProdutos = 0;
        
        for(PedidoCompra pc : pedidoCompraProduto){
            totalProdutos = totalProdutos + pc.getQuantidade();
        }
        
        return totalProdutos;
    }
    
    private static BigDecimal valorMonetarioTotalProdutosPedidoCompra(List<PedidoCompra> pedidoCompraProduto){
        BigDecimal totalValorProdutos = new BigDecimal(0);
        
        for(PedidoCompra pc : pedidoCompraProduto){
            BigDecimal qtdProdutos = new BigDecimal(pc.getQuantidade());
            totalValorProdutos =  totalValorProdutos.add(qtdProdutos.multiply(pc.getProduto_id().getPrecoCompra()));
        }
        
        return totalValorProdutos;
    }
    
    private static String obterDataUltimoPedidoCompra(List<PedidoCompra> pedido){
        if(!pedido.isEmpty()){
           PedidoCompra ped = pedido.get(pedido.size()-1);
        
            if(ped.getDataFinal() != null){
                String dataPedido = ValidarData.converterDataParaFormatoDaMascara(
                    ped.getDataFinal().toString());
                return dataPedido;
            }else{
                return "Não contém";
            } 
        }else{
            return "Não contém";
        }
    }
    
    private static String obterDataUltimoPedidoVenda(List<PedidoVProduto> pedido){
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
    
    private static BigDecimal calcularValorTotalDePedidoVenda(List<PedidoVProduto> pedido) {
        BigDecimal valorTotalPedidos = new BigDecimal(0);
        for(PedidoVProduto pd : pedido){
            BigDecimal qtdProdutos = new BigDecimal(pd.getQuantidadeProduto());
            valorTotalPedidos =  valorTotalPedidos.add(qtdProdutos.multiply(pd.getId_produto().getPrecoVenda()));        
        }
        return valorTotalPedidos;
    }
    
    private static Integer calcularTotalDeProdutosPedidoVenda(List<PedidoVProduto> pedido){
        Integer qtdProdutos = 0;
        for(PedidoVProduto pd : pedido){
            qtdProdutos = qtdProdutos + pd.getQuantidadeProduto();
        }
        return qtdProdutos;
    }
    
}
