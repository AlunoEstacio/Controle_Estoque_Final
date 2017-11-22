package servico;

import dao.PedidoVendaDAO;
import java.util.Date;
import java.util.List;
import modelo.PedidoVProduto;
import modelo.PedidoVenda;
import modelo.Produto;

public class ServicoPedidoVenda {
    ServicoProduto servicoProduto = new ServicoProduto();
    PedidoVendaDAO pedidoDao = new PedidoVendaDAO();
    
    public String InserirPedidoVenda(PedidoVenda pedido){
        boolean inserirPedido = pedidoDao.inserirPedidoVenda(pedido);
        PedidoVProduto pedidoV = new PedidoVProduto();
        
        if(inserirPedido){
            for(Produto prod : pedido.getListaProdutos()){
                pedidoV.setId_pedido(pedido);
                pedidoV.setId_produto(prod);
                pedidoV.setQuantidadeProduto(prod.getQuantidade());
                atualizarQuantidadeProdutoEstoque(prod.getId(), prod.getQuantidade());
                pedidoDao.inserirPedidoVendaProduto(pedidoV);
            }
            return "";
        }else{
            return "Erro";
        }
    }
    
    private void atualizarQuantidadeProdutoEstoque(Integer idProduto, Integer qtdProdutoPedido){
        Produto prod = servicoProduto.selecionarProdutoPorId(idProduto);   
        Integer qtdProduto = prod.getQuantidade() - qtdProdutoPedido;
        servicoProduto.atualizarQuantidadeProduto(idProduto, qtdProduto);
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorReferencia(String nome, String referncia){
        List<PedidoVProduto> listaPedidos = null;
        
        switch (referncia){
            case "Nome": listaPedidos = selecionarTodosPedidosPorNome(nome);
            break;
            
            case "Quantidade": listaPedidos = selecionarTodosPedidosPorQuantidade(nome);
            break;
            
            case "Produto": listaPedidos = selecionarTodosPedidosPorProduto(nome);
            break;
        }
        
        return listaPedidos;
    }
    
    private List<PedidoVProduto> selecionarTodosPedidosPorNome(String nome){
        String nomeBusca = "%"+nome+"%";
        return pedidoDao.selecionarTodosPedidosVendaPorNome(nomeBusca);
    }
    
    private List<PedidoVProduto> selecionarTodosPedidosPorQuantidade(String quantidade){
        String quantidadeBusca = "%"+quantidade+"%";
        return pedidoDao.selecionarTodosPedidosVendaPorQuantidade(quantidadeBusca);
    }
    
    private List<PedidoVProduto> selecionarTodosPedidosPorProduto(String produto){
        String produtoBusca = "%"+produto+"%";
        return pedidoDao.selecionarTodosPedidosVendaPorProduto(produtoBusca);
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVenda(){
        return pedidoDao.selecionarTodosPedidosVenda();
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorClienteId(Integer id){
        return pedidoDao.selecionarTodosPedidosVendaPorClienteId(id);
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorProdutoId(Integer id){
        return pedidoDao.selecionarTodosPedidosVendaPorProdutoId(id);
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorDataInicioEFim(String inicio, String fim){
    return pedidoDao.selecionarTodosPedidosVendaPorDataInicioEFim(inicio, fim);
    }
    
}
