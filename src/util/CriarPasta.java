package util;

import java.io.File;

public class CriarPasta {
    
    public static void criarPstaRelatorios(){
        String nomeMaquina = ObterNomeMaquina.usuario();
        File pasta = new File("C:\\Users\\"+nomeMaquina+"\\Desktop\\RelatoriosCeE");
        pasta.mkdir();

    }
    
    
}
