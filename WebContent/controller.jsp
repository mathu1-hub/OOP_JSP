<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="com.jsp.bean.UserDao"%>
	<jsp:useBean id="u" class="com.jsp.bean.Payment_Bean"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />

	<%
		int i = UserDao.save(u);
	if (i > 0) {
		out.println("SUCCESSFULLY COMPLETED");
	} else {
		out.println("FAILED");
	}
	%>
	<br>
	
	<div class="tenor-gif-embed" data-postid="11723982" data-share-method="host" data-width="15%" data-aspect-ratio="0.982142857142857">
	</div><script type="text/javascript" async src="https://tenor.com/embed.js"></script>
	
	<br><br>
	<a href="Payment.jsp">Click to Add Payment</a>
	<br><br><br>
	<a href="viewusers.jsp"> Click to View Payments </a>

</body>
</html>