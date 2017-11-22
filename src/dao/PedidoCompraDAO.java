package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import modelo.PedidoCompra;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PedidoCompraDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public PedidoCompraDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirPedidoCompra(PedidoCompra pedido){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirPedidoCompra", pedido);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public boolean atualizarStatusPedidoCompra(PedidoCompra pedido){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarStatusPedidoCompra", pedido);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompra(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompra");
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarPedidosCompraPorDataInicioEFim(String inicio, String fim){
        SqlSession session = sqlSessionFactory.openSession();
        HashMap map = new HashMap();
        map.put("dataInicio", inicio);
        map.put("dataFim", fim);
        
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorDataInicioEFim", map);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorIdProduto(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorIdProduto", id);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorNome", nome);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorQuantidade(String quantidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorQuantidade", quantidade);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorProduto(String produto){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorProduto", produto);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorFornecedor(String fornecedor){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorFornecedor", fornecedor);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoCompra> selecionarTodosPedidosCompraPorStatus(String status){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoCompra> listaPedidos = session.selectList("selecionarTodosPedidosCompraPorStatus", status);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
