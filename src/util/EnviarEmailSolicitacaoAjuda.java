package util;


import java.util.Date;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmailSolicitacaoAjuda {
    
    public static void send(String sender, String title, String msg) throws EmailException{
	SimpleEmail email = new SimpleEmail();
        Date dateCurrent = new Date();
		
        email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.addTo("cee.entreprise@gmail.com");
	email.setFrom("entreprise@cee.com", "Entreprise CeE");
	email.setSubject(title+" "+dateCurrent.toString()+" "+sender);
	email.setMsg(msg);
	email.setSSL(true);
	email.setAuthentication("cee.entreprise@gmail.com", "cee@2017");
	email.send();
		
    }
    
}
