<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="findProduct.action" method="post">
	삼풍명<input type="text" name="name">
	<input type="submit" value="검색">
</form>
<hr>
<a href="productList.action">상품리스트</a>
</body>
</html>