<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Offer</title>
</head>

<body>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/doCreate" commandName="offers">

		<div id="formtable">
			<table>
				<tr>
					<td>Name:</td>
					<td><sf:input path="name" name="name" type="text" /></td>
					<sf:errors path="name" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td>Email:</td>
					<td><sf:input path="email" name="email" type="text" /></td>
					<sf:errors path="email" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td>Your Comments:</td>
					<td><sf:textarea path="text" name="text" rows="10" cols="10"></sf:textarea></td>
					<sf:errors path="text" cssClass="error" ></sf:errors>
				</tr>
				<tr>
					<td><input id="submit" value="Submit" type="submit" /></td>
				</tr>
			</table>
		</div>
	</sf:form>


</body>
</html>