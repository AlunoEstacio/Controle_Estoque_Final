package controle;

import java.util.List;
import modelo.Fornecedor;
import servico.ServicoFornecedor;

public class ControleFornecedor {
    ServicoFornecedor servicoFornecedor = new ServicoFornecedor();
    
    public boolean cadastrarFornecedor (Fornecedor fornecedor){
        boolean resultadoCadastro = servicoFornecedor.InserirFornecedor(fornecedor);
        return resultadoCadastro;
    }
    
    public List<Fornecedor> selecionarTodosFornecedores(){
        return servicoFornecedor.selecionarTodosFornecedores();
    }
    
    public List<Fornecedor> selecionarTodosFornecedoresAtivos(){
        return servicoFornecedor.selecionarTodosFornecedoresAtivos();
    }
    
    public List<Fornecedor> selecionarTodosFornecedorPorReferencia(String nome, String referencia){
        return servicoFornecedor.selecionarTodosFornecedorPorReferencia(nome, referencia);
    }
    
    public boolean atualizarFornecedor(Fornecedor fornecedor){
        return servicoFornecedor.atualizarFornecedor(fornecedor);
    }
    
    public boolean deletarFornecedor(Fornecedor fornecedor){
        return servicoFornecedor.deletarFornecedor(fornecedor);
    }
    
}
