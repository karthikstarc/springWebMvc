<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Details</title>
</head>
<body>
	<h4 align="center" style="color: mediumblue;">Enter Id Number to
		get Details</h4>
	<br>
	<br>
	<div align="center">
		<p style="display: inline;">Enter Id =</p>

		<form action="getDetailsResult" method="get" style="display: inline;">
			<input type="number" name="id">
			<input type="submit">
		</form>

	</div>
</body>
</html>