<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=divice-width" , initial-scale="1">

<link rel="stylesheet" href="css/bootstrap.css">

<script src="js/bootstrap.js"></script>
<script src="//code.jquery.com/jquery.min.js"></script>
<head>
<title>Insert title here</title>

</head>
<body>
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="loginAction.jsp">
					<h3 style="text-align: center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
							name="userID" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
							name="userPassword" maxlength="20">
					</div>
					<button type="submit" class="btn btn-primary form-control">로그인</button>
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

</body>
</html>