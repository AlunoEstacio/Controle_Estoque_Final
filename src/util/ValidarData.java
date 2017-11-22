package util;

import java.util.Calendar;

public class ValidarData {
    
    public static boolean verificar(String data){// - - - 12/10/200
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        
        int diaNascimento = Integer.parseInt(data.substring(0, 2));
        int mesNascimento = Integer.parseInt(data.substring(3, 5));
        int anoNascimento = Integer.parseInt(data.substring(6));
        
            if(mesNascimento > 0 && mesNascimento < 13){
            if(mesNascimento == 2){
                if(diaNascimento > 0 && diaNascimento < 30){
                    if(anoNascimento > 0 && anoAtual-anoNascimento > 16 ){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else if(diaNascimento > 0 && diaNascimento < 32){
                if(anoNascimento > 0 && anoAtual-anoNascimento > 16 ){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            } 
        }else{
            return false;
        }
    }    
    
    public static String ConverterData(String data){
        int diaNascimento = Integer.parseInt(data.substring(0, 2));
        int mesNascimento = Integer.parseInt(data.substring(3, 5));
        int anoNascimento = Integer.parseInt(data.substring(6));
        
        data = Integer.toString(anoNascimento)+"-"+Integer.toString(mesNascimento)+"-"+
                Integer.toString(diaNascimento);
        
        return data;
    }
    
    public static String converterDataParaFormatoDaMascara(String data){
        int anoNascimento = Integer.parseInt(data.substring(0, 4));
        int mesNascimento = Integer.parseInt(data.substring(5, 7));
        int diaNascimento = Integer.parseInt(data.substring(8));
        
        String mes = Integer.toString(mesNascimento);
        String dia = Integer.toString(diaNascimento);
        if(mesNascimento<10){
            mes = "0"+mes;
        }
        if(diaNascimento<10){
            dia = "0"+dia;
        }
        
        data = dia+"/"+mes+"/"+Integer.toString(anoNascimento);
        
        return data;
    }
    
}
