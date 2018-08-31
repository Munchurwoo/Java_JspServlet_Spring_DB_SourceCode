<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>
<div class="container">
<a href="index.jsp">홈</a>&nbsp;&nbsp;<a
			href="front?command=getAllProductList">상품목록</a>
		<hr>
		<h3>상품등록</h3>
		<form method="post"  action="front">
			<input type="hidden" name="command" value="registerProduct" required="required">
			상품명 &nbsp;<input type="text" name="name" required="required"> <br>
			제조사	&nbsp;<input type="text" name="maker" required="required" > <br>
			가 격&nbsp;&nbsp; <input type="number" name="price" min="0" required="required"> <br>
			<input type="submit" value="등록">
		</form>
</div>
</body>
</html>