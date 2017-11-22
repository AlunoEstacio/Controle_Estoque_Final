package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import modelo.PedidoVProduto;
import modelo.PedidoVenda;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PedidoVendaDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public PedidoVendaDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirPedidoVenda(PedidoVenda pedido){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirPedidoVenda", pedido);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public boolean inserirPedidoVendaProduto(PedidoVProduto pedidoV){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirPedidoVProduto", pedidoV);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVenda(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVenda");
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorDataInicioEFim(String inicio, String fim){
        SqlSession session = sqlSessionFactory.openSession();
        HashMap map = new HashMap();
        map.put("dataInicio", inicio);
        map.put("dataFim", fim);
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorDataInicioEFim", map);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorNome", nome);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorQuantidade(String quantidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorQuantidade", quantidade);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorProduto(String produto){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorProduto", produto);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorClienteId(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorClienteId", id);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<PedidoVProduto> selecionarTodosPedidosVendaPorProdutoId(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<PedidoVProduto> listaPedidos = session.selectList("selecionarTodosPedidosVendaPorProdutoId", id);
            session.close();
            return listaPedidos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}
