package controle;

import java.util.List;
import modelo.Cliente;
import servico.ServicoCliente;

public class ControleCliente {
    ServicoCliente servicoCliente = new ServicoCliente();
    
    public boolean cadastrarCliente (Cliente cliente){
        boolean resultadoCadastro = servicoCliente.InserirCliente(cliente);
        return resultadoCadastro;
    }
    
    public boolean atualizarCliente(Cliente cliente){
        boolean resultadoAtualizacao = servicoCliente.atualizarCliente(cliente);
        return resultadoAtualizacao;
    }
    
    public List<Cliente> selecionarTodosClientes(){
        return servicoCliente.selecionarTodosClientes();
    }
    
    public List<Cliente> selecionarTodosClientesAtivos(){
        return servicoCliente.selecionarTodosClientesAtivos();
    }
    
    public List<Cliente> selecionarClientesPorReferencia(String nome, String referencia){
        return servicoCliente.selecionarTodosClientePorReferencia(nome, referencia);
    }
    
    public boolean deletarCliente(Cliente cliente){
        return servicoCliente.apagarCliente(cliente);
    }
    
}
