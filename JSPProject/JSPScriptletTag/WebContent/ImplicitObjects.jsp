<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1 style="color: red;">
		<!-- Out Implicit Object -->
		<%
			out.print("Today is:" + java.util.Calendar.getInstance().getTime());
		%>
	</h1> --%>
	<br>
	<%-- 	<!-- Request Implicit Object -->
	<%
		String userName = request.getParameter("uname");
		out.print("Welcome : " + userName);
	%>
 --%>
	<br>
	<%-- Response Implicit Object 
	<%
		response.sendRedirect("http://www.google.com");
	%>  --%>
	<br>

	<%-- <!-- config Implicit Object --> 
	<h1 style="color: orange">
	<%
		out.println("Welcome " + request.getParameter("uname<br>"));

		String driver = config.getInitParameter("dname");
		out.println("<br>driver name is=" + driver);
	%>
	</h1> --%>
	<br>

	<%
		out.print("Welcome : " + request.getParameter("uname"));

		String driver = application.getInitParameter("dbname");
		out.print("<br>driver name is="+driver);
	%>
	<br>
</body>
</html>