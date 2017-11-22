package modelo;

public class FuncionarioLogado {
    private Integer id;
    private String nome;
    private String cargo;
    private String cpf;
    private String email;
    private int recuperacaoSenha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRecuperacaoSenha() {
        return recuperacaoSenha;
    }

    public void setRecuperacaoSenha(int recuperacaoSenha) {
        this.recuperacaoSenha = recuperacaoSenha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
