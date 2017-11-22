package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.List;
import modelo.Cliente;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ClienteDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public ClienteDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirCliente(Cliente cliente){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirCliente", cliente);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public List<Cliente> selecionarTodosClientes(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Cliente> listaClientes = session.selectList("selecionarTodosClientes");
            session.close();
            return listaClientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Cliente> selecionarTodosClientesAtivos(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Cliente> listaClientes = session.selectList("selecionarTodosClientesAtivos");
            session.close();
            return listaClientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Cliente> selecionarClientesPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Cliente> listaClientes = session.selectList("selecionarClientePorNome", nome);
            session.close();
            return listaClientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Cliente> selecionarClientesPorCidade(String cidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Cliente> listaClientes = session.selectList("selecionarClientePorCidade", cidade);
            session.close();
            return listaClientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Cliente> selecionarClientesPorPessoa(String pessoa){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Cliente> listaClientes = session.selectList("selecionarClientePorPessoa", pessoa);
            session.close();
            return listaClientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizarCliente(Cliente cliente){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarCliente", cliente);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean apagarCliente(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("deletarCliente", id);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
}
