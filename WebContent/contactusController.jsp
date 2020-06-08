<%@page import="com.jsp.bean.*"%>
<jsp:useBean id="u" class="com.jsp.bean.contactus"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.Add_Contactus(u);
response.sendRedirect("viewContactus.jsp");
%>