
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {
    public static void main(String[] args) {
    	
        // Mention the Recipient's email address
        String initialTo = "barrylync@gmail.com";
        StringBuilder sbTo = new StringBuilder(initialTo);
        int i = 0;
        while(i < 10) {
        	sbTo.append(", ").append(initialTo);
        	i++;
        }
        String to = sbTo.toString();
        
        // Mention the Sender's email address
        String from = "barrylync@gmail.com";
        // Mention the SMTP server address. Below Gmail's SMTP server is being used to send email
        String host = "smtp.gmail.com";
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        // Get the Session object.// and pass username and password
//        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("barrylync@gmail.com", "homerbart1978");
//            }
//        });
        
                
        
        try {
        	
        	Session session = Session.getInstance(properties);
            Transport transport = session.getTransport("smtp"); 
            
         // Used to debug SMTP issues
            session.setDebug(true);
        	
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(initialTo));
            // message.addRecipients(Message.RecipientType.TO, InternetAddress.parseHeader( to, false));
            
            // Now set the actual message
            message.setText("This is actual message");
            
            int x = 50;
            while( x-- > 0)
            {
            	System.out.println("xxxxxxxx: " + x);
            	switch(x % 5)
            	{
            		case 0:
		            message.setSubject("BarrysAccounts");
		            break;
	            	case 1:
		            message.setSubject("BarrysBuying");
		            break;
	            	case 2:
		            message.setSubject("BarrysNews");
		            break;
	            	case 3:
		            message.setSubject("BarrysPersonal");
		            break;
	            	case 4:
		            message.setSubject("BarrysStuff");
		            break;
            	}
	            System.out.println("sending...");
	            // Send message
	            // Transport.send(message);
	            // Transport.send(message, message.getAllRecipients());

            }
            
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}