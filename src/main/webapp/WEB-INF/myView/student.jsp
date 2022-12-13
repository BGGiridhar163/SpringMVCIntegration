<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
<script type="text/javascript">
	function firstname(){
		let v = document.getElementById('fn').value;
		alert("firstname "+v);
		if(v.length == null){
			alert("firstname is mandatory");
		}
		
	}
</script>
</head>
<body>
	<fieldset>
		<legend>Student Detils</legend>
		<form action="saveStudent" method="post">
			FirstName : <input type="text" name="fn" id="fn"/><br/><br/>
			LastName : <input type="text" name="ln"/><br/><br/>
			Password : <input type="password" name="pwd"/><br/><br/>
			Email : <input type="text" name="em"/><br/><br/>
			DOB : <input type="date" name="db"/><br/><br/>
			<input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="Save" onclick="firstname()"/> 
		</form>
	</fieldset>
	${st}
</body>
</html>