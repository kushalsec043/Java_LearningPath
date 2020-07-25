<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br></br>
Get Alien....
<form action="getAlien">
	<input type="text" name="aid"><br>
	<input type="submit"><br>
</form>

<br></br>
Get Alien By name....
<form action="getAlienbyname">
	<input type="text" name="aname"><br>
	<input type="submit"><br>
</form>

<br></br>
Add alien....
<form action="addAlien">
	<input type="text" name="aid"><br>
	<input type="text" name="aname"><br>
	<input type="submit"><br>
</form>

<br></br>
Get Alien By id greater than ....
<form action="greaterthan">
	<input type="text" name="aid"><br>
	<input type="submit"><br>
</form>






<br></br>
Update alien.....
<form action="UpdateAlien">
	<input type="text" name="aid"><br>
	<input type="text" name="aname"><br>
	<input type="submit"><br>
</form>

<br></br>
Delete alien......
<form action="DeleteAlien">
	<input type="text" name="aid"><br>
	<input type="submit"><br>
</form>

</body>
</html>