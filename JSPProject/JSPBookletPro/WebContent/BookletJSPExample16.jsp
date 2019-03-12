<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="pr2" class="javaBeanEx.PersonBean" scope="session"/>
		FirstName:<jsp:getProperty property="firstName" name="pr2"/><br>
		Email:<jsp:getProperty property="email" name="pr2"/><br>
		Age:<jsp:getProperty property="age" name="pr2"/><br>
		Weight:<jsp:getProperty property="weight" name="pr2"/><br>
		
		<jsp:setProperty property="firstName" name="pr2" value="Umakant"/>
		<jsp:setProperty property="email" name="pr2" value="uk432@gmail.com"/>
		<jsp:setProperty property="age" name="pr2" value="57"/>
		<jsp:setProperty property="weight" name="pr2" value="60.78"/>
		
		<h2>
			FirstName:<jsp:getProperty property="firstName" name="pr2"/><br>
			Email:<jsp:getProperty property="email" name="pr2"/><br>
			Age:<jsp:getProperty property="age" name="pr2"/><br>
			Weight:<jsp:getProperty property="weight" name="pr2"/><br>
		</h2>
		
</body>
</html>