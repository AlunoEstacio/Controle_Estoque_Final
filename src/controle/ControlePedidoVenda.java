package controle;

import java.util.Date;
import java.util.List;
import modelo.PedidoVProduto;
import modelo.PedidoVenda;
import servico.ServicoPedidoVenda;

public class ControlePedidoVenda {
    
    ServicoPedidoVenda servicoPedido = new ServicoPedidoVenda();
    
    public String inserirPedidoVenda(PedidoVenda pedido){
        String resultadoInsercao = servicoPedido.InserirPedidoVenda(pedido);
        return resultadoInsercao;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVenda(){
        return servicoPedido.selecionarTodosPedidosVenda();
    }
    
    public List<PedidoVProduto> selecionarPedidosVendaPorReferencia(String nome, String referencia){
        return servicoPedido.selecionarTodosPedidosVendaPorReferencia(nome, referencia);
    }
    
    public List<PedidoVProduto> selecionarPedidosVendaPorClienteId(Integer id){
        return servicoPedido.selecionarTodosPedidosVendaPorClienteId(id);
    }
    
    public List<PedidoVProduto> selecionarPedidosVendaPorProdutoId(Integer id){
        return servicoPedido.selecionarTodosPedidosVendaPorProdutoId(id);
    }
    
    public List<PedidoVProduto> selecionarPedidosVendaPorDataInicioEFim(String inicio, String fim){
        return servicoPedido.selecionarTodosPedidosVendaPorDataInicioEFim(inicio, fim);
    }
}
