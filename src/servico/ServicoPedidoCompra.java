package servico;

import dao.PedidoCompraDAO;
import java.util.Date;
import java.util.List;
import modelo.PedidoCompra;

public class ServicoPedidoCompra {
    ServicoProduto servicoProduto = new ServicoProduto();
    PedidoCompraDAO pedidoDao = new PedidoCompraDAO();
    
    public boolean InserirPedidoCompra(PedidoCompra pedido){
        boolean resultadoCadastro = pedidoDao.inserirPedidoCompra(pedido);
        if(resultadoCadastro){
            return true; 
        }else{
            return false;
        } 
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorReferencia(String nome, String referncia){
        List<PedidoCompra> listaPedidos = null;
        
        switch (referncia){
            case "Nome": listaPedidos = selecionarTodosPedidosPorNome(nome);
            break;
            
            case "Quantidade": listaPedidos = selecionarTodosPedidosPorQuantidade(nome);
            break;
            
            case "Produto": listaPedidos = selecionarTodosPedidosPorProduto(nome);
            break;
            
            case "Fornecedor": listaPedidos = selecionarTodosPedidosPorFornecedor(nome);
            break;
            
            case "Status": listaPedidos = selecionarTodosPedidosPorStatus(nome);
            break;
        }
        
        return listaPedidos;
    }
    
    private List<PedidoCompra> selecionarTodosPedidosPorNome(String nome){
        String nomeBusca = "%"+nome+"%";
        return pedidoDao.selecionarTodosPedidosCompraPorNome(nomeBusca);
    }
    
    private List<PedidoCompra> selecionarTodosPedidosPorQuantidade(String quantidade){
        String quantidadeBusca = "%"+quantidade+"%";
        return pedidoDao.selecionarTodosPedidosCompraPorQuantidade(quantidadeBusca);
    }
    
    private List<PedidoCompra> selecionarTodosPedidosPorProduto(String produto){
        String produtoBusca = "%"+produto+"%";
        return pedidoDao.selecionarTodosPedidosCompraPorProduto(produtoBusca);
    }
    
    private List<PedidoCompra> selecionarTodosPedidosPorFornecedor(String fornecedor){
        String fornecedorBusca = "%"+fornecedor+"%";
        return pedidoDao.selecionarTodosPedidosCompraPorFornecedor(fornecedorBusca);
    }
    
    private List<PedidoCompra> selecionarTodosPedidosPorStatus(String status){
        String statusBusca = "%"+status+"%";
        return pedidoDao.selecionarTodosPedidosCompraPorStatus(statusBusca);
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompra(){
        return pedidoDao.selecionarTodosPedidosCompra();
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorIdProduto(Integer id){
        return pedidoDao.selecionarTodosPedidosCompraPorIdProduto(id);
    }
    
    public List<PedidoCompra> selecionarPedidosCompraPorDataInicioEFim(String inicio, String fim){
        return pedidoDao.selecionarPedidosCompraPorDataInicioEFim(inicio, fim);
    }
    
    public boolean cancelarPedidoCompra(PedidoCompra pedido){
        pedido.setStatus("CANCELADO");
        boolean resultaAtualizacao = atualizarStatusPedido(pedido);
        if(resultaAtualizacao){
            return true;
        }else{
            return false;
        } 
    }
    
    public boolean fecharPedidoCompra(PedidoCompra pedido){
        Integer quantidadeFinalProduto = quantidadeProdutoAposPedido(pedido.getQuantidade(), 
                pedido.getProduto_id().getQuantidade());
        
        boolean resultadoAtualizacaoQuantidadeProduto = atualizarQuantidadeProduto(pedido.getProduto_id().getId(),
                quantidadeFinalProduto);
        
        if(resultadoAtualizacaoQuantidadeProduto){
            boolean resultaAtualizacao = atualizarStatusPedido(pedido);
            if(resultaAtualizacao){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private Integer quantidadeProdutoAposPedido(Integer quantidadeProduto, Integer quantidadeProdutoPedido){
        Integer quantidadeFinalProduto = quantidadeProduto + quantidadeProdutoPedido;
        return quantidadeFinalProduto;
    }
    
    private boolean atualizarQuantidadeProduto(Integer idProduto, Integer quantidadeFinalProduto){
        boolean resultadoAtualizacao = servicoProduto.atualizarQuantidadeProduto(idProduto, quantidadeFinalProduto);
        if(resultadoAtualizacao){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean atualizarStatusPedido(PedidoCompra pedido){
        boolean resultaAtualizacao = pedidoDao.atualizarStatusPedidoCompra(pedido);
        if(resultaAtualizacao){
            return true;
        }else{
            return false;
        }
    }
    
}
