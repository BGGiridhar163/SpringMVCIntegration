<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Jocotpus Student Details</h2>
<table border="1">
	<tr>
		<th>Student Id</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Password</th>
		<th>Email</th>
		<th>Date of birth</th>
	</tr>
	<c:forEach var="st" items="${sls}">
		<tr>
			<td>${st.getId()}</td>
			<td>${st.getFirstName()}</td>
			<td>${st.getLastName()}</td>
			<td>${st.getPassword()}</td>
			<td>${st.getEmail()}</td>
			<td>${st.getDob()}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>