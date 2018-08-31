<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<!-- offset: 2비중만큼 오른쪽으로 이동 -->
			<div class="col-sm-8 col-sm-offset-2">
				<a href="${pageContext.request.contextPath }/index.jsp">홈</a>
				<hr>
				<h4>회원가입</h4>
				<form method="post" name="registerForm"
					action="${pageContext.request.contextPath }/front">
					<input type="hidden" name="command" value="register"> 아이디 :
					<input type="text" name="id" required="required"> <br>패스워드
					: <input type="password" name="password" required="required">
					<br>이름 : <input type="text" name="name" required="required">
					<br>주소 : <input type="text" name="address" required="required">	<br>
					<input type="submit" value="가입하기">
				</form>
			</div>
		</div>
		<!--  row  -->
	</div>
	<!-- container -->

</body>
</html>







