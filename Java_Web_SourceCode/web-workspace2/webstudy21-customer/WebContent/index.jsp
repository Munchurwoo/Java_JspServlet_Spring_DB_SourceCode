<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/css.css">
<head>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="member_count.jsp"></jsp:include>
	<input type="hidden" name="command" value="member_count">
	<!-- <form action="front">
		
		<input type="submit" value="회원수 보기">
	</form> -->
	<!-- <a href="front?command=member_count">회원 수 보기</a> -->
<!-- 	<input type="hidden" name="command" value="member_count">
 --></body>
</html>