<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Already a user? <a href="/">Log in</a>
	<form action="addUser" method="post">
		Email : <input type="text" name="email"><br>
		
		Password : <input type="password" name="password"><br>
		
		Confirm Password : <input type="password" name="confirmPassword"><br>
		
		Security Question : <input type="text" name="securityQuestion"><br>
		
		Security Answer : <input type="text" name="securityAnswer"><br>
		
		Phone Number : <input type="text" name="phoneNumber"><br>
		
		<input type="submit">
	</form>
</body>
</html>