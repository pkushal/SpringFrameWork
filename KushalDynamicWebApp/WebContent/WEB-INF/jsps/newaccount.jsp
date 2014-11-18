<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
</head>

<body>
<h2>Create New Account</h2>
	<sf:form method="post"
		action="${pageContext.request.contextPath}/createaccount" commandName="user">

		<div id="formtable">
			<table>
				<tr>
					<td>UserName:</td>
					<td><sf:input path="username" name="username" type="text" /></td>
					<sf:errors path="username" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td>Email:</td>
					<td><sf:input path="email" name="email" type="text" /></td>
					<sf:errors path="email" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td>Password:</td>
					<td><sf:input path="password" name="password" type="text" /></td>
					<sf:errors path="password" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input name="confirmpass" type="text" /></td>
				</tr>
			
				<tr>
					<td><input id="submit" value="Create Account" type="submit" /></td>
				</tr>
			</table>
		</div>
	</sf:form>


</body>
</html>