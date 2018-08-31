<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>
<div class="container">
<h3>Model2 상품관리</h3>
<a href="register_product.jsp">상품등록</a><br>
<a href="front?command=getAllProductList">상품목록</a><br><br>
</div>



<!-- <hr>
<form method="post" action="front">
<input type="hidden" name="command" value="registerProduct">
상품명 <input type="text" name="name" required="required"> <br>
제조사 <input type="text" name="maker" required="required"> <br>
가격 <input type="number" name="price" required="required"> <br>
<input type="submit" value="등록">
</form> -->
</body>
</html>