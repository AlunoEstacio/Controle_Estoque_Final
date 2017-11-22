package controle;

import servico.ServicoLogin;

public class ControleLogin {
    ServicoLogin servicoLogin = new ServicoLogin();
    
    public boolean verificarLoginFuncionario(String email, String senha){
        boolean resultadoVerificacao = servicoLogin.verificarLogin(email, senha);
        return resultadoVerificacao;
    };
    
    public String atulizarSenhaFuncionario(String email, String senha, String novaSenha){
        String resultadoVerificacao = servicoLogin.atualizarSenhaFuncionario(email, senha, novaSenha);
        return resultadoVerificacao;
    };
    
    public boolean recuperarSenhaFuncionario(String email){
        return servicoLogin.recuperarSenhaFuncionario(email);
    }
    
}
