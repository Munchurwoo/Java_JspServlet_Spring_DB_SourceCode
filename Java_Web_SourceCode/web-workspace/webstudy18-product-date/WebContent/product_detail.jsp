<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.kosta.model.ProductDTO"%>
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
		ProductDTO vo = (ProductDTO) request.getAttribute("vo");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(vo.getRegDate());
	%>
	<table border="1">
		<tr>
			<td>순번</td>
			<td><%=vo.getPno()%></td>
		</tr>
		<tr>
			<td>상품명</td>
			<td><%=vo.getName()%></td>
		</tr>
		<tr>
			<td>제조사</td>
			<td><%=vo.getMaker()%></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><%=vo.getPrice()%></td>
		</tr>
		<tr>
			<td>상품등록 상세 시간</td>
			<td><%=date%></td>
		</tr>
	</table>
</body>
</html>





