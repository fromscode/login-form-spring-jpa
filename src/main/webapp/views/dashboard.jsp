<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome ${user}
	
	<form action="deleteUser" method="post">
		<input type="hidden" value="${user.email}" name="email">
		<input type="submit" value="Delete User">
	</form>

	
</body>
</html>