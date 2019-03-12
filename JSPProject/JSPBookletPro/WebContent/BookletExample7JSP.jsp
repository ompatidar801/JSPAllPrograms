<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp 7 Begin</h1>
	<br>
	<h1>
		<jsp:include page ="BookletExample8JSP.jsp">
			<jsp:param value="45" name="param1"/>
			<jsp:param value="4545" name="param2"/>
		</jsp:include>
	</h1>
	<%-- <%= tr %> --%>
	<h1>Jsp 7 End</h1>
</body>
</html>