/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegularMaintainanceDeptRole;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class MailSender
{
final String senderEmailID = "kunal.m.sharma.90@gmail.com";
final String senderPassword = "JUP!ter@24953018";
final String emailSMTPserver = "smtp.gmail.com";
final String emailServerPort = "465";
String receiverEmailID = null;
static String emailSubject = "Regular Maintainance";
static String emailBody = "Rout should be avoided";
public MailSender(String receiverEmailID, String emailSubject, String emailBody)
{
this.receiverEmailID=receiverEmailID;
this.emailSubject=emailSubject;
this.emailBody=emailBody;
Properties props = new Properties();
props.put("mail.smtp.user",senderEmailID);
props.put("mail.smtp.host", emailSMTPserver);
props.put("mail.smtp.port", emailServerPort);
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.socketFactory.port", emailServerPort);
props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.socketFactory.fallback", "false");
SecurityManager security = System.getSecurityManager();
try
{
Authenticator auth = new SMTPAuthenticator();
Session session = Session.getInstance(props, auth);
MimeMessage msg = new MimeMessage(session);
msg.setText(emailBody);
msg.setSubject(emailSubject);
msg.setFrom(new InternetAddress(senderEmailID));
msg.addRecipient(Message.RecipientType.TO,
new InternetAddress(receiverEmailID));
Transport.send(msg);
System.out.println("Message sent Successfully:)");
}
catch (Exception mex)
{
mex.printStackTrace();
}
}
public class SMTPAuthenticator extends javax.mail.Authenticator
{
public PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(senderEmailID, senderPassword);
}
}
public static void main(String[] args)
{     
MailSender mailSender=new
MailSender("bhatian32@yahoo.com",emailSubject,emailBody);
}
}