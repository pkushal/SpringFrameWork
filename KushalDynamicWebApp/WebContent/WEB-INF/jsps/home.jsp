<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kushal Dynamic</title>
</head>
<body>
	Hello Kushal !
	<br> How are you doing with Spring frame work?
	<br> Session:
	<%=session.getAttribute("name")%>
	<br> The name from the modelandView (request) is:
	<%=request.getAttribute("name")%>
	<br> using the RE language: ${name }
	<br>
	<!-- 
	Using the jstl:	<c:out value="${name}"></c:out>


	<sql:query var="rs" dataSource="jdbc/spring">
	select id, name, email, text from offers
	</sql:query>

	<br>
	<c:forEach var="row" items="${rs.rows}">
   ID:  ${row.id}<br />
    Name: ${row.name}<br />
	</c:forEach>
 -->


<br>
	<c:forEach var="row" items="${offers}">
   ID:  ${row.id}<br />
    Name: ${row.name}<br />
    Email: ${row.email}<br />
    Text: ${row.text}<br />
	</c:forEach>

</body>
</html>