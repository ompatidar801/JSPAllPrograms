<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="javaBeanEx.JavaBeanExample1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! JavaBeanExample1 jbe1 = new JavaBeanExample1();  %>
	<%
		jbe1.setI(10);
		jbe1.setName("Shubendu");
		
		int i= jbe1.getI();
		String name = jbe1.getName();
	%>
	<h1>Value of i is:</h1><%=i %>
	<h1>Value of name is:</h1><%= name %>
</body>
</html>