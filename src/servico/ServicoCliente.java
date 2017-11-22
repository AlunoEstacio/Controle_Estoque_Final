package servico;

import dao.ClienteDAO;
import java.util.List;
import modelo.Cliente;

public class ServicoCliente {
    ServicoEndereco servicoEndereco = new ServicoEndereco();
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public boolean InserirCliente(Cliente cliente){
        boolean resultadoCadastroEndereco = servicoEndereco.InserirEndereco(cliente.getEndereco());
        
        if(resultadoCadastroEndereco){
            boolean resultadoCadastro = clienteDAO.inserirCliente(cliente);
            if(resultadoCadastro){
                return true; 
            }else{
                return false;
            } 
        }else{
            return false;
        } 
    }
    
    public boolean atualizarCliente(Cliente cliente){
        boolean resultadoAtualizarEndereco = servicoEndereco.atualizarEndereco(cliente.getEndereco());
            
        if(resultadoAtualizarEndereco){
            boolean resultadoAtualizarCliente = clienteDAO.atualizarCliente(cliente);
            if(resultadoAtualizarCliente){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public List<Cliente> selecionarTodosClientes(){
        return clienteDAO.selecionarTodosClientes();
    }
    
    public List<Cliente> selecionarTodosClientesAtivos(){
        return clienteDAO.selecionarTodosClientesAtivos();
    }
    
    public List<Cliente> selecionarTodosClientePorReferencia(String nome, String referencia){
        List<Cliente> listaClientes = null;
        
        switch (referencia){
            case "Nome/Razão social": listaClientes = selecionarClientesPorNome(nome);
            break;
            
            case "Cidade": listaClientes = selecionarClientesPorCidade(nome);
            break;
            
            case "Pessoa": listaClientes = selecionarClientesPorPessoa(nome);
            break;
        }
        
        return listaClientes;
    }
    
    private List<Cliente> selecionarClientesPorNome(String nome){
        String nomeBuscar = "%"+nome+"%";
        return clienteDAO.selecionarClientesPorNome(nomeBuscar);
    }
    
    private List<Cliente> selecionarClientesPorCidade(String cidade){
        String cidadeBuscar = "%"+cidade+"%";
        return clienteDAO.selecionarClientesPorCidade(cidadeBuscar);
    }
    
    private List<Cliente> selecionarClientesPorPessoa(String pessoa){
        String pessoaBuscar = "%"+pessoa+"%";
        return clienteDAO.selecionarClientesPorPessoa(pessoaBuscar);
    }
    
    public boolean apagarCliente(Cliente cliente){
        boolean resultadoDeleteCliente = clienteDAO.apagarCliente(cliente.getId());
        
        if(resultadoDeleteCliente){
            return true;
        }else{
            return false;
        } 
    }
    
}
