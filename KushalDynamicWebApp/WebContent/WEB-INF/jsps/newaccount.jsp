<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/script/jquery.js"></script>

<script type="text/javascript">
	function onLoad() {
		$("#password").keyup(checkPasswordsMatch);
		$("#confirmpass").keyup(checkPasswordsMatch);
		$("#details").submit(canSubmit);
	}

	function canSubmit() {
		var password = $("#password").val();
		var confirmpass = $("#confirmpass").val();

		if (password != confirmpass) {
			alert("<fmt:message key='UnmatchedPassword.user.password'></fmt:message>")
			return false;
		}
		return true;
	}

	function checkPasswordsMatch() {
		var password = $("#password").val();
		var confirmpass = $("#confirmpass").val();

		if (password.length > 3 || confirmpass.length > 3) {
			if (password == confirmpass) {
				$("#matchpass").addClass("valid");
				$("#matchpass").removeClass("error");
				$("#matchpass")
						.text(
								"<fmt:message key='MatchedPassword.user.password'></fmt:message>");
			} else {
				$("#matchpass").addClass("error");
				$("#matchpass").removeClass("valid");
				$("#matchpass")
						.text(
								"<fmt:message key='UnmatchedPassword.user.password'></fmt:message>");
			}
		}
	}
	$(document).ready(onLoad);
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
</head>

<body>
	<h2>Create New Account</h2>
	<sf:form id="details" method="post"
		action="${pageContext.request.contextPath}/createaccount"
		commandName="user">

		<div id="formtable">
			<table>
				<tr>
					<td>UserName:</td>
					<td><sf:input path="username" name="username" type="text" /></td>
					<sf:errors path="username" cssClass="error"></sf:errors>
				</tr>
				<tr>
					<td>Email:</td>
					<td><sf:input path="email" name="email" type="text" /></td>
					<sf:errors path="email" cssClass="error"></sf:errors>
				</tr>
				<tr>
					<td>Password:</td>
					<td><sf:input id="password" path="password" name="password"
							type="password" /></td>
					<sf:errors path="password" cssClass="error"></sf:errors>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input id="confirmpass" name="confirmpass" type="password" /></td>
					<div id="matchpass"></div>
				</tr>

				<tr>
					<td><input id="submit" value="Create Account" type="submit" /></td>
				</tr>
			</table>
		</div>
	</sf:form>


</body>
</html>