<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<form action="ProductNumberInfo.do" >
	조회 할 상품 번호 입력 <input type="text" name="product_no">
	<input type="submit" value="전송">
	</form></br>
	<a href="detailProduct.do">상품 전체 리스트 보기</a>
	</br>
	
	<form action="insertProduct.do">
	상품명 :<input type="text" name="name"></br>
	제조사 : <input type="text" name="maker"></br>
	가격 : <input type="text" name="price"></br>
	<input type="submit" value="전송">
	</form>
</body>
</html>