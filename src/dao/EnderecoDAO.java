package dao;

import dao.factory.MyBatisConnectionFactory;
import modelo.Endereco;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class EnderecoDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public EnderecoDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirEndereco(Endereco endereco){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirEndereco", endereco);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public boolean atualizarEndereco(Endereco endereco){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarEndereco", endereco);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean apagarEndereco(Endereco endereco){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("deletarEndereco", endereco.getId());
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }

    
}
