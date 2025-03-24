<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	New here?<a href="signup"> Sign Up</a>
	<form action="verifyLogin" method="post">
		Email : <input type="text" name="email">
		Password : <input type="text" name="password">
		<input type="submit">
	</form>
	<br>
	<a href="forgotPassword">Forgot Password?</a>
</body>
</html>