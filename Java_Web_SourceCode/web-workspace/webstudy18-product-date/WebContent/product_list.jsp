<%@page import="org.kosta.model.ProductDTO"%>
<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product_list</title>
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
		@SuppressWarnings("unchecked")
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) request.getAttribute("list");
	%>
	<table border="1">
		<thead>
			<tr>
				<th>순번</th>
				<th>상품명</th>
				<th>등록시간</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getPno()%></td>
				<td>
				<a href="front?command=findProductById&id=<%=list.get(i).getPno()%>"><%=list.get(i).getName()%></a>
				</td>
				<td><%=list.get(i).getRegDate() %></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>






</html>