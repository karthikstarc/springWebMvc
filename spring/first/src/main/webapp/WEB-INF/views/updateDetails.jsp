<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Details</title>
</head>
<body>
<h1 align="center">CRUD Operations</h1>
<h4 align="center">Enter Data to Update details</h4>

	
<form action="updateDetailsResult" method="get" align="center">
	<p style="display: inline;" >Enter Id </p><input type="number" name="id"><br><br>
	Enter Name: <input type="text" name="name"><br><br>
	Enter Marks: <input type="number" name="marks"><br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit">
</form>

</body>
</html>