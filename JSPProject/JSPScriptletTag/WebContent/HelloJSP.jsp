<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% out.print("Hello: Welcome to JSP"); %>
	<br>
	<%= "Hello: Welcome to JSP expression tag" %>
	<br> Current Time:
	<%= java.util.Calendar.getInstance().getTime() %>
	<br>
	<%!  int data=50; %>
	<%= "Value of the variable is:"+data %><br>

	<%!   
		public int cube(int n)
	{  
		return n*n*n;  
	}  
	%>
	
	<%= "Cube of 3 is:"+cube(3) %><br>
	
	<%! int a=10; %><br>
	<%  int a = 20;
		out.println("local Variable(scriptlet) a value is : " +a);
		out.println("instance Variable(declaration) a value is : " +this.a);
	%><br>

</body>
</html>