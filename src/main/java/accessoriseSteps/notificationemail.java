package accessoriseSteps;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class notificationemail {
//
    private static final Logger LOGGER = Logger.getLogger(notificationemail.class.getName());

	int flagemail=0;
	int confirmf=0;
	int fillf=0;
	int custf=0;
	
	private String from;
    private String password;
    private String to;

    public notificationemail() {}
    public notificationemail(String from, String password, String to) {
        this.from = from;
        this.password = password;
        this.to = to;
    }
    
    public int getflagemail()
    {
    	return flagemail;
    }

    public void sendEmail(String subject, String body) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);

            System.out.println("Email sent successfully!");
            flagemail=1;
            

        } catch (MessagingException e) {
        	LOGGER.log(Level.INFO,"An error occurred: " + e.getMessage(), e);
        	
        }
}
	public void setcustf(int i) {
		this.custf=i;
		
	}
	public void setconfirmf(int i) {
		this.confirmf=i;
		
	}
	public void setfillf(int i) {
		this.fillf=i;
		
	}
    
    
}
