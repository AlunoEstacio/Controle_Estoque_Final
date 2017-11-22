package controle;

import modelo.Relatorio;
import servico.ServicoSolicitarRelatorio;

public class ControleSolicitarRelatorio {
    ServicoSolicitarRelatorio servicoRelatorio = new ServicoSolicitarRelatorio();
    
    public void solicitarGeracaoRelatorio(Relatorio relatorio){
        servicoRelatorio.criarRelatorio(relatorio);
    }
    
}
