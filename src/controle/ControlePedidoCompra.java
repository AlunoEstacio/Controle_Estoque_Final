package controle;

import java.util.Date;
import java.util.List;
import modelo.PedidoCompra;
import servico.ServicoPedidoCompra;

public class ControlePedidoCompra {
    
    ServicoPedidoCompra servicoPedido = new ServicoPedidoCompra();
    
    public boolean inserirPedidoCompra(PedidoCompra pedido){
        boolean resultadoInsercao = servicoPedido.InserirPedidoCompra(pedido);
        return resultadoInsercao;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompra(){
        return servicoPedido.selecionarTodosPedidosCompra();
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorIdProduto(Integer id){
        return servicoPedido.selecionarTodosPedidosCompraPorIdProduto(id);
    }
    
    public List<PedidoCompra> selecionarPedidosCompraporReferencia(String nome, String referencia){
        return servicoPedido.selecionarTodosPedidosCompraPorReferencia(nome, referencia);
    }
    
    public List<PedidoCompra> selecionarPedidosCompraPorDataInicioEFim(String inicio, String fim){
        return servicoPedido.selecionarPedidosCompraPorDataInicioEFim(inicio, fim);
    }
    
    public boolean fecharPedidoCompra(PedidoCompra pedido){
        boolean resultadoFechamentoPedido = servicoPedido.fecharPedidoCompra(pedido);
        return resultadoFechamentoPedido;
    }
    
    public boolean cancelarPedidoCompra(PedidoCompra pedido){
        boolean resultadoCancelamentoPedido = servicoPedido.cancelarPedidoCompra(pedido);
        return resultadoCancelamentoPedido;
    }
}
