<%@page import="com.jsp.bean.Payment_Bean"%>
<%@page import="com.jsp.bean.UserDao"%>
<jsp:useBean id="u" class="com.jsp.bean.Payment_Bean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>