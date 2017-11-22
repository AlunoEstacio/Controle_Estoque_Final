package servico;

import dao.FuncionarioDAO;
import java.util.List;
import modelo.Funcionario;
import modelo.FuncionarioLogado;

public class ServicoFuncionario {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    ServicoEndereco servicoEndereco = new ServicoEndereco();
    
    public String InserirFuncionario(Funcionario funcionario){
        boolean verificarExistenciaEmail = verificarExistenciaEmail(funcionario);
        
        if(!verificarExistenciaEmail){
            boolean resultadoCadastroEndereco = servicoEndereco.InserirEndereco(funcionario.getEndereco());
            if(resultadoCadastroEndereco){
                boolean resultadoCadastro = funcionarioDAO.inserirPessoa(funcionario);
                if(resultadoCadastro){
                    return ""; 
                }else{
                    return "Cadastro";
                } 
            }else{
                return "Cadastro";
            }
        }else{
            return "Email Existente";
        }
         
    }
    
    public String atualizarInformacoesFuncionario(FuncionarioLogado funcLogado, Funcionario funcionario){
        if(funcLogado.getEmail().equals(funcionario.getEmail()) && funcLogado.getId() == funcionario.getId()){
            return verificarNivelAcessoFuncionarioLogado(funcLogado, funcionario);
        }else{
            boolean verificarExistenciaEmail = verificarExistenciaEmail(funcionario);
            if(!verificarExistenciaEmail){
                return verificarNivelAcessoFuncionarioLogado(funcLogado, funcionario);
            }else{
                return "Erro email existente";
            }
        }
    }
    
    private String verificarNivelAcessoFuncionarioLogado (FuncionarioLogado funcLogado, Funcionario funcionario){
      
        if(funcLogado.getId() == funcionario.getId() && funcLogado.getCargo().equals(funcionario.getCargo())){
            return atualizarRegistroFuncionario(funcionario);
        }else{
            if(funcLogado.getCargo().equals("GERENTE")){
                return atualizarRegistroFuncionario(funcionario);
            }else{
                return "Funcionario sem permissão";
            } 
        }
    }
    
    private String atualizarRegistroFuncionario(Funcionario funcionario){
        boolean resultadoAtualizarEndereco = servicoEndereco.atualizarEndereco(funcionario.getEndereco());
            if(resultadoAtualizarEndereco){
                boolean resultadoAtualizarFuncionario = funcionarioDAO.atualizarFuncionario(funcionario);
                if(resultadoAtualizarFuncionario){
                    return "";
                }else{
                    return "Erro de na atualização de cadastro";
                }
            }else{
                return "Erro de na atualização de cadastro";
            }
    }
    
    public String alterarStatusFuncionario(FuncionarioLogado funcionarioLogado, Funcionario funcionario){
        if(funcionarioLogado.getCargo().equals("GERENTE")){
                boolean resultadoAtualizarFuncionario = funcionarioDAO.alterarStatusFuncionario(funcionario);
                if(resultadoAtualizarFuncionario){
                    return "";
                }else{
                    return "Erro de na atualização de cadastro";
                }
        }else{
            return "Funcionário sem permissão para realizar essa alteração";
        }
    }
    
    public List<Funcionario> selecionarTodosFuncionarios(){
        return funcionarioDAO.selecionarTodosFuncionarios();
    }
    
    public List<Funcionario> selecionarFuncionariosPorReferencia(String nome, String referencia){
        List<Funcionario> listaFuncionario = null;
        
        switch (referencia){
            case "Nome" : listaFuncionario = selecionarFuncionarioPorNome(nome);
            break;
            
            case "CPF" : listaFuncionario = selecionarFuncionarioPorCPF(nome);
            break;
            
            case "Cidade" : listaFuncionario = selecionarFuncionarioPorCidade(nome);
            break;
            
            case "Cargo" : listaFuncionario = selecionarFuncionarioPorCargo(nome);
            break;
        }
        
        return listaFuncionario;
    }
    
    public Funcionario selecionarFuncionarioPorId(Integer id){
        return funcionarioDAO.selecionarFuncionarioPorId(id);
    }
    
    public FuncionarioLogado selecionarFuncionariosPorEmail(String email){
        return funcionarioDAO.selecionarFuncionariosPorEmail(email);
    }
    
    private List<Funcionario> selecionarFuncionarioPorNome(String nome){
        String nomeBuscar = "%"+nome+"%";
        return funcionarioDAO.selecionarFuncionariosPorNome(nomeBuscar);
    }
    
    private List<Funcionario> selecionarFuncionarioPorCPF(String cpf){
        String cpfBuscar = "%"+cpf+"%";
        return funcionarioDAO.selecionarFuncionariosPorCPF(cpfBuscar);
    }
    
    private List<Funcionario> selecionarFuncionarioPorCidade(String cidade){
        String cidadeBuscar = "%"+cidade+"%";
        return funcionarioDAO.selecionarFuncionariosPorCidade(cidadeBuscar);
    }
    
    private List<Funcionario> selecionarFuncionarioPorCargo(String cargo){
        String cargoBuscar = "%"+cargo+"%";
        return funcionarioDAO.selecionarFuncionariosPorCargo(cargoBuscar);
    }
    
    private boolean verificarExistenciaEmail(Funcionario func){
        Funcionario funcionario = funcionarioDAO.verificarExistenciaEmail(func.getEmail());
        if(funcionario != null){
            if(func.getId() == funcionario.getId()){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    
    public void alterarStatusAlteracaoSenhaFuncionario(Integer idFuncionario){
        funcionarioDAO.alterarStatusAlterarSenhaFuncionario(idFuncionario);
    }
}
