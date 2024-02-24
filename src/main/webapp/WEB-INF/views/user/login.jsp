<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	${message}
	<h1>Login</h1>
	<form action="login.htm" method="post">
		<label for="username">Username: </label>
		<input type="text" id="username" name="username"> <br>
		<label for="password">Password: </label> 
		<input type="password" id="password" name="password"> <br>
		<button type="submit">Login</button>
	</form>
</body>
</html>