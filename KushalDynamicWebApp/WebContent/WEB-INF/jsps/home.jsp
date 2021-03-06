<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kushal Dynamic</title>
</head>
<body>

<h1>Welcome to Dynamic Web Application</h1>
<br><p><a href="${pageContext.request.contextPath}/offers">Show current offers</a></p>
<p><a href="${pageContext.request.contextPath}/createoffer">Create offers</a></p>

<sec:authorize access="!isAuthenticated()">
<p><a href="<c:url value='/login'></c:url>">Log In</a></p>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
<p><a href="<c:url value='/j_spring_security_logout'></c:url>">LogOut</a></p>
</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">
<p><a href="${pageContext.request.contextPath}/admin">Admin</a></p>
</sec:authorize>



	<br>
	<!-- 
	Hello Kushal !
	<br> How are you doing with Spring frame work?
	<br> Session:
	<%=session.getAttribute("name")%>
	<br> The name from the modelandView (request) is:
	<%=request.getAttribute("name")%>
	<br> using the RE language: ${name }
	
	
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



</body>
</html>