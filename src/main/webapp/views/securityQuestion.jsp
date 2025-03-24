<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="verifyAnswer" method="post">
		Security Question : <input type="text" value="${user.securityQuestion}">
		Answer : <input type="text" name="answer">
		<input type="hidden" name="email" value="${user.email}">
		<input type="submit">
	</form>
	
</body>
</html>