<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	String result;
	
final String to = request.getParameter("mail");
final String subject = request.getParameter("sub");
final String message = request.getParameter("mess");

final String from = "it18190458@my.sliit.lk";
final String pswd = "sliit1996";

String host = "smtp.gmail.com";

Properties props = new Properties();

props.put("mail.smtp.host",host);
props.put("mail.transport.protocol","smtp");
props.put("mail.smtp.auth","true");
props.put("mail.smtp.starttls.enable","true");
props.put("mail.user",from);
props.put("mail.password",pswd);
props.put("mail.port",465);

Session mailSession = Session.getInstance(props, new mailSession.Authenticator()
{
	@Override
	
	protected PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(from,pswd);
	}
});



try{
	
	MimeMessage message = new MimeMessage();
	message.setFrom(new InternetAddress(from));
	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	message.setSubject(subject);
	message.setText(message);
	Transport.send(message);
	
	result="mail Sucessfully Send";

	
}
catch(MessagingException e)
{
	e.printStackTrace();
	result = "unable to send";
}

%>

</body>
</html> --%>