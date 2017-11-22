package controle;

import java.util.List;
import modelo.Funcionario;
import modelo.FuncionarioLogado;
import servico.ServicoFuncionario;

public class ControleFuncionario {
    ServicoFuncionario servicoFuncionario = new ServicoFuncionario();
    
    public String cadastrarFuncionario (Funcionario funcionario){
        String resultadoCadastro = servicoFuncionario.InserirFuncionario(funcionario);
        return resultadoCadastro;
    }
    
    public FuncionarioLogado selecionarFuncionarioPorEmail(String email){
        return servicoFuncionario.selecionarFuncionariosPorEmail(email);
    }
    
    public Funcionario selecionarFuncionarioPorId(Integer id){
        return servicoFuncionario.selecionarFuncionarioPorId(id);
    }

    public List<Funcionario> selecionarTodosFuncionarios(){
        return servicoFuncionario.selecionarTodosFuncionarios();
    }
    
    public List<Funcionario> selecionarFuncionariosPorReferencia(String nome, String referencia){
        return servicoFuncionario.selecionarFuncionariosPorReferencia(nome, referencia);
    }
    
    public String atualizarCadastroFuncionario(FuncionarioLogado funcLogado, Funcionario funcionario){
        return servicoFuncionario.atualizarInformacoesFuncionario(funcLogado, funcionario);
    }
    
    public String atualizarStatusFuncionario(FuncionarioLogado funcLogado, Funcionario funcionario){
        return servicoFuncionario.alterarStatusFuncionario(funcLogado, funcionario);
    }
    
}
