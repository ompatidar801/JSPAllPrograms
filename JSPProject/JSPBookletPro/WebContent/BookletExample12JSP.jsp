<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>JSP 12 Start</h2><br/>
			<h3>
				<jsp:forward page ="BookletExample8JSP.jsp">
				<jsp:param value="757" name="param1"/>
				<jsp:param value="213" name="param2"/>
		</jsp:forward>
		
			</h3>
		<h2>JSP 12 End</h2><br/>
</body>
</html>