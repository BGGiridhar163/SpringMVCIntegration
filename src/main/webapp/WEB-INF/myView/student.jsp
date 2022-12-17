<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>

</head>
<body>
	<fieldset>
		<legend>Student Details</legend>
		<form:form action="save" method="post" >
			<!-- Id : <input type="text" name="id"> -->
			FirstName : <input type="text" name="firstName" /><br/><br/>
			LastName : <input type="text" name="lastName"/><br/><br/>
			Password : <input type="password" name="password"/><br/><br/>
			Email : <input type="text" name="email"/><br/><br/>
			DOB : <input type="date" name="dob"/><br/><br/>
			<input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="Save" /> 
		</form:form>
	</fieldset>
	${st}
</body>
</html>