<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:forward page="front">
    <jsp:param value="getAllProductList" name="command"/>
    </jsp:forward>
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
<a href="register_product.jsp">상품등록</a><br><br>
<a href="front?command=getAllProductList">상품목록</a><br><br>
</div>
</body>
</html>










