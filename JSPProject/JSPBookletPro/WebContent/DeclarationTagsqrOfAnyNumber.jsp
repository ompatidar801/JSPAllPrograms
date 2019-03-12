<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		public int squr(int y)
		{
			return y*y;
		}
	%>
	<h1>
		<% out.println(squr(4)); %><br/>
		<% out.println(squr(76)); %><br/>
		<% out.println(squr(5)); %><br/>
		<% out.println(squr(675)); %><br/>
		<% out.println(squr(44)); %><br/>
		<% out.println(squr(34)); %><br/>
	</h1>
</body>
</html>