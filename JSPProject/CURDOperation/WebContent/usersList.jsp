<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Users</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>S_NO</th>
				<th>First_Name</th>
				<th>Last_Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Gender</th>
				<th>Country</th>
				<th>State</th>
				<th>City</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="users">
				<tr>
					<td><c:out value="${users.S_No}" /></td>
					<td><c:out value="${users.First_Name}" /></td>
					<td><c:out value="${users.Last_Name}" /></td>
					<td><c:out value="${users.Email}" /></td>
					<td><c:out value="${users.Password}" /></td>
					<td><c:out value="${users.Gender}" /></td>
					<td><c:out value="${users.Country}" /></td>
					<td><c:out value="${users.State}" /></td>
					<td><c:out value="${users.City}" /></td>
					<td><a
						href="StudentController.do?action=edit&studentId=<c:out value="${users.S_No }"/>">Update</a></td>
					<td><a
						href="StudentController.do?action=delete&studentId=<c:out value="${users.S_No }"/>">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="StudentController.do?action=insert">Add Student</a>
	</p>
</body>
</html>