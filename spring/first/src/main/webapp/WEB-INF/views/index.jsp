<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1 align="center">CRUD Operations</h1>
<h4 align="center">Enter Data to Add details</h4>


	<form action="addDetailsResult" method="get" align="center">
	<label size="20px"> Enter ID: </label>

	<input type="number" name="id"><br><br>

	<label size="20px" > Enter Name: </label>

	<input type="text" name="name"><br><br>

	<label size="20px" >Enter Marks: </label>
	<input type="text" name="marks"><br>
	<input type="submit" align="center">
	</form>
	

	<hr><hr>
	


<hr>
	
<div  align="center">

	<form action="getDetails" style="display: inline">
		<button type="submit"
			style="height: 50px; width: 8%; border-radius: 15px; background-color: powderblue">Get</button>
	</form>
	<form action="updateDetails" style="display: inline">
		<button type="submit"
			style="height: 50px; width: 8%; border-radius: 15px; background-color: powderblue">UpdateDetails</button>
	</form>
	<form action="delete" style="display: inline">
		<button type="submit"
			style="height: 50px; width: 8%; border-radius: 15px; background-color: powderblue">Delete</button>
	</form>
</div>
</body>
</html>