<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@page import="javaBeanEx.PersonBean" %>
		<jsp:useBean id="pr2" class="javaBeanEx.PersonBean" scope="session"/>
		<% PersonBean pr3 = (PersonBean)session.getAttribute("p1");%>
		FirstName:<jsp:getProperty property="firstName" name="pr2"/><br>
		Email:<jsp:getProperty property="email" name="pr2"/><br>
		Age:<jsp:getProperty property="age" name="pr2"/><br>
		Weight:<jsp:getProperty property="weight" name="pr2"/><br>
		
</body>
</html>