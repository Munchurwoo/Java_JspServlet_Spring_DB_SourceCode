<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="front" method="post">
		<input type="hidden" name="command" value="loginCheck"><br>
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="password"><br>
		<input type="submit" vlaue="로그인">
	</form>
</body>
</html>