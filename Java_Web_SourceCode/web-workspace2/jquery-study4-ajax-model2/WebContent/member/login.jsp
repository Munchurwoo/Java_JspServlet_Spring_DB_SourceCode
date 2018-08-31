<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login화면</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">		
			<!-- offset: 2비중만큼 오른쪽으로 이동 -->
			<div class="col-sm-8 col-sm-offset-2">
			<a href="${pageContext.request.contextPath}/index.jsp">홈</a><br><br>
				<form method="post"
					action="${pageContext.request.contextPath}/front">
					<input type="hidden" name="command" value="login"> 아이디 &nbsp; &nbsp; <input
						type="text" name="memberId" required="required"><br>
					패스워드 <input type="password" name="memberPassword"
						required="required"><br> <input type="submit"
						value="로그인">
				</form>
			</div>
		</div>
		<!--  row  -->
	</div>
	<!-- container -->

</body>
</html>











