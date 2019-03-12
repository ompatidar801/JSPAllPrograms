<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="UsersController" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fname" value="<c:out value="${users.First_Name}" />"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lname" value="<c:out value="${users.Last_Name}" />"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="<c:out value="${users.Email}" />"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="<c:out value="${users.Password}" />"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gen" value="<c:out value="${users.Gender}" />">Male <input
					type="radio" name="gen"value="<c:out value="${users.Gender}" />">Female</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="country" >
						<option>India</option>
						<option>Pakistan</option>
						<option>UK</option>
						<option>Nepal</option>
				</select></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><select name="state">
						<option>Madhya Pradesh</option>
						<option>Maharastra</option>
						<option>Utter Pradesh</option>
						<option>Lahor</option>
						<option>Rajesthan</option>
						<option>Gujrat</option>
				</select></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><select name="city">
						<option>Ujjain</option>
						<option>Indore</option>
						<option>Dhar</option>
						<option>Dewas</option>
						<option>Bhopal</option>
						<option>Rajkot</option>
						<option>Baroda</option>
						<option>Dahod</option>
						<option>Ahamdabad</option>
						<option>Mumbai</option>
						<option>Puna</option>
						<option>Lakhnow</option>
				</select></td>
			</tr>
			<tr><td colspan="2"><input type="submit" value="Submit"/></td></tr> 
		</table>
	</form>
</body>
</html>