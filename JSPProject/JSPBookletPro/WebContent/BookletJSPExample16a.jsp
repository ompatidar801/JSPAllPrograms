<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="pr1" class="javaBeanEx.PersonBean" scope="session"/>
		
		<%	pr1.setFirstName("Ramakant <br>");
			pr1.setEmail("rk23@gmail.com <br>");
			pr1.setAge(23);
			out.print("<br/>");
			pr1.setWeight(67.99);
			out.print("<br/>");
			
			response.sendRedirect("BookletJSPExample17.jsp?p1="+pr1);
		%>
</body>
</html>