<!DOCTYPE html>
<%@page import="com.jsp.bean.UserDao"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Details</title>
</head>
<body>

<%@page import="com.jsp.bean.contactus,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Contact Us List</h1>

<%
List<contactus> list=UserDao.getAllRecordsContact();
request.setAttribute("list",list);
%>

<table border="3" width="100%">
<tr><th>Full Name</th><th>Email</th><th>Phone Number</th><th>Message</th></tr>
<c:forEach items="${list}" var="u">

	<tr><td>${u.getFullname()}</td><td>${u.getEmail()}</td><td>${u.getPhonenumber()}</td><td>${u.getMessgae()}</td></tr>
	
</c:forEach>
</table>

</body>
</html>