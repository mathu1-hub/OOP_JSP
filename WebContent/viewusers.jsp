<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Payment Details</title>
</head>
<body>

<%@page import="com.jsp.bean.UserDao,com.jsp.bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Payments List</h1>

<%
List<Payment_Bean> list=UserDao.getAllRecords();
request.setAttribute("list",list);
%>




<table border="2" width="100%">
<tr><th>Id</th><th>Name</th><th>e-mail</th><th>Address</th><th>City</th><th>State</th><th>Zip</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">

	<tr><td>${u.getId()}</td><td>${u.getFullName()}</td><td>${u.getEmail()}</td><td>${u.getAddress()}</td><td>${u.getCity()}</td>
	<td>${u.getState()}</td><td>${u.getZip()}</td>
	
	<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td><td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>
</c:forEach>
</table>
<a href="Payment.jsp">Click to Add Payment</a>

</body>
</html>