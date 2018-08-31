<%@page import="org.kosta.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세상품정보</title>
<style type="text/css">
th, td {
	padding: 10px;
}
</style>
</head>
<body>
<a href="index.jsp">Home</a>
<hr>
<%
		ProductVO vo=(ProductVO)request.getAttribute("productVO");
%>
<table border="1">
<tr>
	<td>아이디</td><td><%=vo.getId() %></td>
</tr>
<tr>
	<td>상품명</td><td><%=vo.getName() %></td>
</tr>
<tr>
	<td>제조사</td><td><%=vo.getMaker() %></td>
</tr>
<tr>
	<td>가격</td><td><%=vo.getPrice() %></td>
</tr>
</table>
</body>
</html>





