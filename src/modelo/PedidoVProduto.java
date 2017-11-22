package modelo;

public class PedidoVProduto {
    private PedidoVenda id_pedido;
    private Produto id_produto;
    private Integer quantidadeProduto;

    public PedidoVenda getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(PedidoVenda id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto id_produto) {
        this.id_produto = id_produto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    
    
}
