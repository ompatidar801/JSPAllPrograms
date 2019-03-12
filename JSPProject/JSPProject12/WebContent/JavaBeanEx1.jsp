<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="jbe" class="javaBeanExamples.JavaBeanEx1"></jsp:useBean>
	<jsp:setProperty name="jbe" property="rollno" value="23"/>
	<p>Rollno of Student:</p>	
	<jsp:getProperty name="jbe" property="rollno"/>
	
	<jsp:setProperty name="jbe" property="name" value ="Ravi"/>
	<p>Name of Student:</p> 
	<jsp:getProperty name="jbe" property="name"/>
</body>
</html>