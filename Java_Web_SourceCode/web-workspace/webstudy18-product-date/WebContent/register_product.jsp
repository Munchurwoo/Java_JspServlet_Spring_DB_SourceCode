<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품 등록하기 </h3><br>
	<form action="front" >
	<input type="hidden" name="command" value="RegisterProduct">
	상품명 : <input type="text" name="name"><br>
	제조사 : <input type="text" name="maker"><br>
	가격 : <input type="text" name="price"><br>	
	<input type="submit" value="상품 등록">
	</form>
</body>
</html>