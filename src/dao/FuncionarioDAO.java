package dao;

import dao.factory.MyBatisConnectionFactory;
import java.util.List;
import modelo.Funcionario;
import modelo.FuncionarioLogado;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class FuncionarioDAO {
    
    private SqlSessionFactory sqlSessionFactory;
 
    public FuncionarioDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    
    public boolean inserirPessoa(Funcionario funcionario){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.insert("inserirFuncionario", funcionario);
            session.commit();
            return true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return false;
    }
    
    public boolean atualizarFuncionario(Funcionario funcionario){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarFuncionario", funcionario);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Funcionario> selecionarTodosFuncionarios(){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Funcionario> listaFuncionarios = session.selectList("selecionarTodosFuncionarios");
            session.close();
            return listaFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Funcionario selecionarFuncionarioPorId(Integer id){
        
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            Funcionario funcionario = session.selectOne("selecionarFuncionarioPorId", id);
            session.close();
            return funcionario;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Funcionario> selecionarFuncionariosPorNome(String nome){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Funcionario> listaFuncionarios = session.selectList("selecionarFuncionariosPorNome", nome);
            session.close();
            return listaFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Funcionario> selecionarFuncionariosPorCPF(String cpf){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Funcionario> listaFuncionarios = session.selectList("selecionarFuncionariosPorCPF", cpf);
            session.close();
            return listaFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Funcionario> selecionarFuncionariosPorCidade(String cidade){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Funcionario> listaFuncionarios = session.selectList("selecionarFuncionariosPorCidade", cidade);
            session.close();
            return listaFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Funcionario> selecionarFuncionariosPorCargo(String cargo){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            List<Funcionario> listaFuncionarios = session.selectList("selecionarFuncionariosPorCargo", cargo);
            session.close();
            return listaFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public FuncionarioLogado selecionarFuncionariosPorEmail(String email){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            FuncionarioLogado funcionarioLogado = session.selectOne("selecionarFuncionarioPorEmail", email);
            session.close();
            return funcionarioLogado;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean alterarStatusFuncionario(Funcionario funcionario){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarStatusFuncionario", funcionario.getId());
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean alterarStatusAlterarSenhaFuncionario(Integer idFuncionario){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("atualizarStatusRecuperarSenhaFuncionario", idFuncionario);
            session.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Funcionario verificarExistenciaEmail(String email){
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            Funcionario func = session.selectOne("verificarExistenciaEmail", email);
            session.close();
            return func;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
