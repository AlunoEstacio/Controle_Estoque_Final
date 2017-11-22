package servico;

import dao.EnderecoDAO;
import modelo.Endereco;

public class ServicoEndereco {
    
    EnderecoDAO enderecoDAO = new EnderecoDAO();
    
    public boolean InserirEndereco(Endereco endereco){
        boolean resultadoCadastro = enderecoDAO.inserirEndereco(endereco);
        if(resultadoCadastro){
            return true; 
        }else{
            return false;
        } 
    }
    
    public boolean atualizarEndereco(Endereco endereco){
        boolean resultadoAtualizar = enderecoDAO.atualizarEndereco(endereco);
        if(resultadoAtualizar){
            return true;
        }else{
           return false; 
        }  
    }
    
    public boolean deletarEndereco(Endereco endereco){
        boolean resultaDeleteEndereco = enderecoDAO.apagarEndereco(endereco);
        
        if(resultaDeleteEndereco){
            return true;
        }else{
            return false;
        }
    }
    
}
