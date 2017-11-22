package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.List;
import modelo.Produto;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProdutoDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public ProdutoDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirProduto(Produto produto){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirProduto", produto);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public Produto selecioanarProdutoPorId (Integer id) {
	SqlSession session = sqlSessionFactory.openSession();

        try {
            Produto produto = (Produto) session.selectOne("selecionarProdutoPorId",id);
            session.close();
            return produto;
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
            return null;
    }
    
    public List<Produto> selecionarTodosProdutos(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutos");
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> selecionarProdutosPorId(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarProdutosPorId", id);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizarProduto(Produto produto){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarProduto", produto);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean atualizarQuantidadeProduto(Produto produto){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarQuantidadeProduto", produto);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Produto> selecionarTodosProdutosPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutosPorNome", nome);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> selecionarTodosProdutosPorMarca(String marca){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutosPorMarca", marca);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> selecionarTodosProdutosPorFornecedor(String fornecedor){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutosPorFornecedor", fornecedor);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> selecionarTodosProdutosPorCategoria(String categoria){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutosPorCategoria", categoria);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> selecionarTodosProdutosPorQuantidade(String quantidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Produto> listaProdutos = session.selectList("selecionarTodosProdutosPorQuantidade", quantidade);
            session.close();
            return listaProdutos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean apagarProduto(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("deletarProduto", id);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
}
