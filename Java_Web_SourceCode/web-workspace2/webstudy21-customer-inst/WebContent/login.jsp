<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/home.css">
<title>home</title>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp" />		
		<form name="loginForm" method="post" action="front">
			<input type="hidden" name="command" value="Login"> 아이디 : <input
				type="text" name="id" required="required"><br> 패스워드 : <input
				type="password" name="password" required="required"><br>
			<input type="submit" value="로그인">
		</form>		
	</div>
</body>
</html>





