<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
<h1>index</h1>
<form action="/print" method="post">
		<div>
			<div><!-- JSTL Dependency -->
			<label for="userName">User Name : </label>
			<input type="text" id="userName" name="userName" placeholder="enter User name">
			</div>
			<div>
			<input type="submit" value="Hit me!">
			</div>
		</div>
	</form>
</body>
</html>