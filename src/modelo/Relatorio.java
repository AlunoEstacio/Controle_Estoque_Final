package modelo;

import java.util.Date;

public class Relatorio {
    
    private String nome;
    private String dataInicio;
    private String dataFinal;
    private String tipo;
    private FuncionarioLogado funcionarioSolicitante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public FuncionarioLogado getFuncionarioSolicitante() {
        return funcionarioSolicitante;
    }

    public void setFuncionarioSolicitante(FuncionarioLogado funcionarioSolicitante) {
        this.funcionarioSolicitante = funcionarioSolicitante;
    }
    
}
