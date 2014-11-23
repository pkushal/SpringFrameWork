<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css">
</head>
<body onload='document.f.j_username.focus();'>
	<h3>Login with Username and Password</h3>

	<c:if test="${param.error!=null}">

		<p class="loginerror">Login failed. User name and password do not
			match out database. Please try again</p>

	</c:if>


	<form name='f'
		action='${pageContext.request.contextPath}/j_spring_security_check'
		method='POST'>

		<div id="formtable">
			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='j_username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='j_password' /></td>
				</tr>
				<tr>
					<td>Remeber Me :)</td>
					<td><input type="checkbox" name='_spring_security_remember_me' checked="checked"/></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit"
						value="Login" /></td>
				</tr>
			</table>
		</div>
	</form>
	<p>
		<a href="<c:url value="/newaccount"></c:url>">Create New Account</a>
	</p>
</body>
</html>
