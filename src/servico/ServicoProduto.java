package servico;

import dao.ProdutoDAO;
import java.util.List;
import modelo.Produto;

public class ServicoProduto {

    ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public boolean InserirFornecedor(Produto produto){
        boolean resultadoCadastro = produtoDAO.inserirProduto(produto);
        
        if(resultadoCadastro){
            return true; 
        }else{
            return false;
        } 
    }
    
    public Produto selecionarProdutoPorId(Integer id){
        return produtoDAO.selecioanarProdutoPorId(id);
    }
    
    public List<Produto> selecionarTodosProdutos(){
        return produtoDAO.selecionarTodosProdutos();
    }
    
    public List<Produto> selecionarProdutosPorId(Integer id){
        return produtoDAO.selecionarProdutosPorId(id);
    }
    
    public boolean atualizarProduto(Produto produto){
        boolean resultadoAtualizar = produtoDAO.atualizarProduto(produto);
        if(resultadoAtualizar){
            return true;
        }else{
           return false; 
        }  
    }
    
    public boolean atualizarQuantidadeProduto(Integer idProduto, Integer quantidadeFinalProduto){
        Produto pro = new Produto();
        pro.setId(idProduto);
        pro.setQuantidade(quantidadeFinalProduto);
        
        boolean resultadoAtualizar = produtoDAO.atualizarQuantidadeProduto(pro);
        if(resultadoAtualizar){
            return true;
        }else{
           return false; 
        }  
    }
    
    public List<Produto> selecionarTodosProdutosPorReferencia(String nome, String referencia){
        List<Produto> listaProdutos = null;
        
        switch (referencia){
            case "Nome": listaProdutos = selecionarTodosProdutosPorNome(nome);
            break;
            
            case "Marca": listaProdutos = selecionarTodosProdutosPorMarca(nome);
            break;
            
            case "Fornecedor": listaProdutos = selecionarTodosProdutosPorFornecedor(nome);
            break;
            
            case "Categoria": listaProdutos = selecionarTodosProdutosPorCategoria(nome);
            break;
            
            case "Quantidade": listaProdutos = selecionarTodosProdutosPorQuantidade(nome);
            break;
        }
        
        return listaProdutos;
    }
    
    public boolean deletarProduto(Produto produto){
        boolean resultadoDeletarProduto = produtoDAO.apagarProduto(produto.getId());
        return resultadoDeletarProduto;
    }
    
    private List<Produto> selecionarTodosProdutosPorNome(String nome){
        String nomeBusca = "%"+nome+"%";
        return produtoDAO.selecionarTodosProdutosPorNome(nomeBusca);
    }
    
    private List<Produto> selecionarTodosProdutosPorMarca(String marca){
        String marcaBusca = "%"+marca+"%";
        return produtoDAO.selecionarTodosProdutosPorMarca(marcaBusca);
    }
    
    private List<Produto> selecionarTodosProdutosPorFornecedor(String fornecedor){
        String fornecedorBusca = "%"+fornecedor+"%";
        return produtoDAO.selecionarTodosProdutosPorFornecedor(fornecedorBusca);
    }
    
    private List<Produto> selecionarTodosProdutosPorCategoria(String categoria){
        String categoriaBusca = "%"+categoria+"%";
        return produtoDAO.selecionarTodosProdutosPorCategoria(categoriaBusca);
    }
    
    private List<Produto> selecionarTodosProdutosPorQuantidade(String quantidade){
        String quantidadeBusca = "%"+quantidade+"%";
        return produtoDAO.selecionarTodosProdutosPorQuantidade(quantidadeBusca);
    }
    
}
