package Ferme.Dao;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class Smtp {

    public  void enviarSmtp(String destinatario, String asunto, String cuerpo) {

        String remitente = "equipoferme2020@gmail.com";
        String contra ="animaldoom";
        
        Properties props = System.getProperties();
        
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", contra);   
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587"); 

        Session s = Session.getDefaultInstance(props, null);
        MimeMessage  texto = new MimeMessage(s);
       
        try {
            texto.setFrom(new InternetAddress(remitente));
            texto.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario));
            texto.setSubject(asunto);    
            texto.setText(cuerpo);
            
            try (Transport ts = s.getTransport("smtp")) {
                ts.connect(remitente,contra);
                ts.sendMessage(texto,texto.getRecipients(Message.RecipientType.TO));
            }
            
            
            

        } catch (MessagingException e) {            
            System.out.println("error en el smtp");
        }

    }
}
