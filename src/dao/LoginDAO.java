package dao;

import dao.factory.MyBatisConnectionFactory;
import modelo.Funcionario;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class LoginDAO {
    
    private SqlSessionFactory sqlSessionFactory;

    public LoginDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public Funcionario buscarFuncionarioEmail(String email) {
	SqlSession session = sqlSessionFactory.openSession();

        try {
            Funcionario funcionario = (Funcionario) session.selectOne("selecionarLoginFuncionario",email);
            session.close();
            return funcionario;
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
            return null;
    }
    
    public boolean atualizarSenhaFuncionario(Funcionario funcionario) {
	SqlSession session = sqlSessionFactory.openSession();

        try {
            session.update("atualizarSenha",funcionario);
            session.commit();
            return true;
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
            return false;
    }
        
}
