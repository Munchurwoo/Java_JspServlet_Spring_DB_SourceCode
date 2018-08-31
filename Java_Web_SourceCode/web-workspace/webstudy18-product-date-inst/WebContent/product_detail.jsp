<%@page import="org.kosta.model.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link rel="stylesheet" type="text/css" href="home.css">
<%
	ProductDTO dto = (ProductDTO) request.getAttribute("dto");
%>
</head>
<body>
<div class="container">
	<a href="index.jsp">홈</a>&nbsp;&nbsp;&nbsp;&nbsp;
	 <a href="front?command=getAllProductList">상품목록</a>
	<hr>
	<table>
		<tr>
			<td>상품번호</td>
			<td><%=dto.getPno()%></td>
		</tr>
		<tr>
			<td>상품명</td>
			<td><%=dto.getName()%></td>
		</tr>
		<tr>
			<td>제조사</td>
			<td><%=dto.getMaker()%></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><%=dto.getPrice()%></td>
		</tr>
		<tr>
			<td>등록일시</td>
			<td><%=dto.getRegDate()%></td>
		</tr>		
	</table>
	<br>
	<br>
	</div>
</body>
</html>