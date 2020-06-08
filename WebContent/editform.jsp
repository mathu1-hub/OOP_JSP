<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.jsp.bean.*,com.jsp.bean.Payment_Bean"%>

<%
String id=request.getParameter("id");
Payment_Bean u=UserDao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
<input type="hidden" name="id" value="<%=u.getId() %>"/>
<table>
<tr><td>fullname:</td><td><input type="text" name="fullName" value="<%= u.getFullName()%>"/></td></tr>
<tr><td>email:</td><td><input type="text" name="email" value="<%= u.getEmail()%>"/></td></tr>
<tr><td>address:</td><td><input type="text" name="address" value="<%= u.getAddress()%>"/></td></tr>

<tr><td>city:</td><td><input type="text" name="city" value="<%= u.getCity()%>"/></td></tr>
<tr><td>state:</td><td><input type="text" name="state" value="<%= u.getState()%>"/></td></tr>
<tr><td>zip:</td><td><input type="text" name="zip" value="<%= u.getZip()%>"/></td></tr>

<tr><td>card name:</td><td><input type="text" name="cardname" value="<%= u.getCardname()%>"/></td></tr>
<tr><td>card number:</td><td><input type="text" name="cardnumber" value="<%= u.getCardnumber()%>"/></td></tr>
<tr><td>Exp month:</td><td><input type="text" name="expmonth" value="<%= u.getExpmonth()%>"/></td></tr>

<tr><td>Exp year:</td><td><input type="text" name="expyear" value="<%= u.getExpyear()%>"/></td></tr>
<tr><td>cvv:</td><td><input type="text" name="cvv" value="<%= u.getCvv()%>"/></td></tr>


<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>

</body>
</html>