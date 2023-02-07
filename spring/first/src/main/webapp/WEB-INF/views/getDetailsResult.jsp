<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Details Result</title>
</head>
<body>
<div align="center"><h4 style="display: inline;">Entered Id is  =</h4>

</div><br><br><hr>
<div align="center"><p style="display: inline; size: 50px;">Result.....!</p></div><br>
<div align="center" style="display:inline">	
	<table border="3" style="background-color: powderblue; width: 50%;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Marks</th>
			<th>Percentage</th>
		</tr>
		<tr>
			<td>${stu.id }</td>
			<td>${stu.name }</td>
			<td>${stu.marks }</td>
			<td>${stu.marks/marks }</td>
		</tr></table></div><br><br>

<p align="center"> Click here to go to Home.....</p>
	<form action="index" align="center">
		<button type="submit" style="height: 40px; width: 8%; border-radius: 15px; background-color: powderblue; margin: auto">Home</button>
	</form>
</body>
</html>