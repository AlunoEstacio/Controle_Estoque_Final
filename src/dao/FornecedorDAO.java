package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.List;
import modelo.Fornecedor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class FornecedorDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public FornecedorDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirFornecedor(Fornecedor fornecedor){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirFornecedo", fornecedor);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public List<Fornecedor> selecionarTodosFornecedores(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Fornecedor> listaFornecedores = session.selectList("selecionarTodosFornecedores");
            session.close();
            return listaFornecedores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Fornecedor> selecionarTodosFornecedoresAtivos(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Fornecedor> listaFornecedores = session.selectList("selecionarTodosFornecedoresAtivos");
            session.close();
            return listaFornecedores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Fornecedor> selecionarTodosFornecedoresPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Fornecedor> listaFornecedores = session.selectList("selecionarTodosFornecedoresPorNome", nome);
            session.close();
            return listaFornecedores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Fornecedor> selecionarTodosFornecedoresPorCNPJ(String cnpj){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Fornecedor> listaFornecedores = session.selectList("selecionarTodosFornecedoresPorCNPJ", cnpj);
            session.close();
            return listaFornecedores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
            
    public List<Fornecedor> selecionarTodosFornecedoresPorCidade(String cidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Fornecedor> listaFornecedores = session.selectList("selecionarTodosFornecedoresPorCidade", cidade);
            session.close();
            return listaFornecedores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizarFornecedor(Fornecedor fornecedor){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarFornecedor", fornecedor);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deletarFornecedor(Fornecedor fornecedor){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("InativarFornecedor", fornecedor.getId());
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
}
