package servico;

import controle.ControleCliente;
import controle.ControlePedidoCompra;
import controle.ControlePedidoVenda;
import controle.ControleProduto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.PedidoCompra;
import modelo.PedidoVProduto;
import modelo.Produto;
import modelo.Relatorio;
import relatorios.RelatorioCliente;
import relatorios.RelatorioPedidoCompra;
import relatorios.RelatorioPedidoVenda;
import relatorios.RelatorioProduto;
import util.ValidarData;

public class ServicoSolicitarRelatorio {
    ControleProduto controleProduto = new ControleProduto();
    ControleCliente controleCliente = new ControleCliente();
    ControlePedidoVenda controlePedidoVenda = new ControlePedidoVenda();
    ControlePedidoCompra controlePedidoCompra = new ControlePedidoCompra();
    
    public void criarRelatorio(Relatorio relatorio){
        String tipoRelatorio = relatorio.getTipo();
        
        switch(tipoRelatorio){
            case "Relatório de Produto" : criarRelatorioDeProdutos(relatorio);
            break;
            
            case "Relatório de Cliente" : criarRelatorioCliente(relatorio);
            break;
                
            case "Relatório de Pedido Venda" : criarRelatorioPedidoVenda(relatorio);
            break;
                
            case "Relatório de Pedido Compra" : criarRelatorioPedidoCompra(relatorio);
            break;
        }
        
    }
    
    private void criarRelatorioDeProdutos(Relatorio relatorio){
        List<Produto> produtos = controleProduto.selecionarTodosProdutos();
        RelatorioProduto.gerarPdf(produtos, relatorio);
    }
    
    private void criarRelatorioCliente(Relatorio relatorio){
        List<Cliente> clientes = controleCliente.selecionarTodosClientes();
        RelatorioCliente.gerarPdf(clientes, relatorio);
    }
    
    private void criarRelatorioPedidoVenda(Relatorio relatorio){
        String dataInicioBusca = ValidarData.ConverterData(relatorio.getDataInicio());
        String dataFinalBusca = ValidarData.ConverterData(relatorio.getDataFinal());
        
        List<PedidoVProduto> pedidos = controlePedidoVenda.selecionarPedidosVendaPorDataInicioEFim
        (dataInicioBusca, dataFinalBusca);
        RelatorioPedidoVenda.gerarPdf(pedidos, relatorio);
    }
    
    private void criarRelatorioPedidoCompra(Relatorio relatorio){
            
        String dataInicioBusca = ValidarData.ConverterData(relatorio.getDataInicio());
        String dataFinalBusca = ValidarData.ConverterData(relatorio.getDataFinal());
            
        List<PedidoCompra> pedidos = controlePedidoCompra.selecionarPedidosCompraPorDataInicioEFim
                (dataInicioBusca, dataFinalBusca);
        RelatorioPedidoCompra.gerarPdf(pedidos, relatorio);
        
        
    }
    
}
