package Ferme.Dao;

import FermeEscritoriodb.configInput;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Smtp {    

    public void enviarSmtp(String destinatario, String asunto, String cuerpo) throws FileNotFoundException, IOException {

        try {            
            String remitente = new configInput().recuperarDato("correoF");
            String contra = new configInput().recuperarDato("passCf");

            Properties props = System.getProperties();

            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.user", remitente);
            props.put("mail.smtp.clave", contra);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(props, null);
            MimeMessage texto = new MimeMessage(s);

            texto.setFrom(new InternetAddress(remitente));
            texto.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            texto.setSubject(asunto);
            texto.setContent(cuerpo, "text/html; charset=utf-8");
            try (Transport ts = s.getTransport("smtp")) {
                ts.connect(remitente, contra);
                ts.sendMessage(texto, texto.getRecipients(Message.RecipientType.TO));
            }

        } catch (MessagingException e) {
            System.out.println("error en el smtp");
        }

    }
}
