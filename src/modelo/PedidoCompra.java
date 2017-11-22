package modelo;

import java.io.Serializable;
import java.sql.Date;

public class PedidoCompra implements Serializable{
    
    private Integer id;
    private String nome;
    private Integer quantidade;
    private Produto produto_id;
    private Fornecedor fornecedor_id;
    private String observacao;
    private String status;
    private Date dataInicio;
    private Date dataFinal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Produto produto_id) {
        this.produto_id = produto_id;
    }

    public Fornecedor getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(Fornecedor fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
  
        
}
