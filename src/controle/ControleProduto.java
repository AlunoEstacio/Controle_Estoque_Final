package controle;

import java.util.List;
import modelo.Produto;
import servico.ServicoProduto;

public class ControleProduto {
    
    ServicoProduto servicoProduto = new ServicoProduto();
    
    public boolean cadastrarProduto(Produto produto){
        boolean resultadocadastroProduto = servicoProduto.InserirFornecedor(produto);
        return resultadocadastroProduto;
    }
    
    public boolean atualizarProduto(Produto produto){
        boolean resultadoAtualizacaoProduto = servicoProduto.atualizarProduto(produto);
        return resultadoAtualizacaoProduto;
    }
    
    public List<Produto> selecionarTodosProdutos(){
        return servicoProduto.selecionarTodosProdutos();
    }
    
    public List<Produto> selecionarProdutosPorIdFornecedor(Integer id){
        return servicoProduto.selecionarProdutosPorId(id);
    }
    
    public List<Produto> selecionarTodosProdutosPorReferencia(String nome, String referencia){
        return servicoProduto.selecionarTodosProdutosPorReferencia(nome, referencia);
    }
    
    public boolean apagarProduto(Produto produto){
        return servicoProduto.deletarProduto(produto);
    }
}
