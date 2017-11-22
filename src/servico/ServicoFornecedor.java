package servico;

import dao.FornecedorDAO;
import java.util.List;
import modelo.Fornecedor;

public class ServicoFornecedor {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    ServicoEndereco servicoEndereco = new ServicoEndereco();
    
    public boolean InserirFornecedor(Fornecedor fornecedor){
        boolean resultadoCadastroEndereco = servicoEndereco.InserirEndereco(fornecedor.getEndereco());
        
        if(resultadoCadastroEndereco){
            boolean resultadoCadastro = fornecedorDAO.inserirFornecedor(fornecedor);
            if(resultadoCadastro){
                return true; 
            }else{
                return false;
            } 
        }else{
            return false;
        } 
    }
    
    public boolean atualizarFornecedor(Fornecedor fornecedor){
        boolean resultadoAtualizarEndereco = servicoEndereco.atualizarEndereco(fornecedor.getEndereco());
            
        if(resultadoAtualizarEndereco){
            boolean resultadoAtualizarFuncionario = fornecedorDAO.atualizarFornecedor(fornecedor);
            if(resultadoAtualizarFuncionario){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public List<Fornecedor> selecionarTodosFornecedorPorReferencia(String nome, String referencia){
        List<Fornecedor> listaFornecedores = null;
        
        switch (referencia){
            case "Razão Social": listaFornecedores = selecionarTodosFornecedoresPorNome(nome);
            break;
            
            case "CNPJ": listaFornecedores = selecionarTodosFornecedoresPorCNPJ(nome);
            break;
            
            case "Cidade": listaFornecedores = selecionarTodosFornecedoresPorCidade(nome);
            break;
        }
        
        return listaFornecedores;
    }
    
    private List<Fornecedor> selecionarTodosFornecedoresPorNome(String nome){
        String nomeBuscar = "%"+nome+"%";
        return fornecedorDAO.selecionarTodosFornecedoresPorNome(nomeBuscar);
    }
    
    private List<Fornecedor> selecionarTodosFornecedoresPorCNPJ(String cnpj){
        String cnpjBuscar = "%"+cnpj+"%";
        return fornecedorDAO.selecionarTodosFornecedoresPorCNPJ(cnpjBuscar);
    }
    
    private List<Fornecedor> selecionarTodosFornecedoresPorCidade(String cidade){
        String cidadeBuscar = "%"+cidade+"%";
        return fornecedorDAO.selecionarTodosFornecedoresPorCidade(cidadeBuscar);
    }
    
    public List<Fornecedor> selecionarTodosFornecedores(){
        return fornecedorDAO.selecionarTodosFornecedores();
    }
    
    public List<Fornecedor> selecionarTodosFornecedoresAtivos(){
        return fornecedorDAO.selecionarTodosFornecedoresAtivos();
    }
    
    public boolean deletarFornecedor(Fornecedor fornecedor){
        boolean resultadoDeleteFornecedor = fornecedorDAO.deletarFornecedor(fornecedor);
        
        if(resultadoDeleteFornecedor){
            return true;  
        }else{
            return false;
        }
    }
  
}
