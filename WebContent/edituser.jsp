<%@page import="com.jsp.bean.UserDao"%>
<jsp:useBean id="u" class="com.jsp.bean.Payment_Bean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%

UserDao.Update(u);
response.sendRedirect("viewusers.jsp");
%>