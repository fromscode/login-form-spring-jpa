<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="updatePassword" method="post">
		Enter new Password : <input type="text" name="password">
		Confirm Password : <input type="text" name="confirmPassword">
		<input type="hidden" name="email" value="${user.email}">
		<input type="submit">
	</form>
	
</body>
</html>