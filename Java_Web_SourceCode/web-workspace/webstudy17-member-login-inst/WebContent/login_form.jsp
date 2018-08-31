<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼</title>
</head>
<body>
<form action="front">
<input type="hidden" name="command" value="login">
아이디 <input type="text" name="id" required="required"><br>
패스워드 <input type="password" name="password" required="required"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>






