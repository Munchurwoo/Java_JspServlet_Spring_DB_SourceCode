<%@page import="org.kosta.model.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>
<div class="container">
	<a href="index.jsp">홈</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="register_product.jsp">등록</a>
	<hr>
	<%
		@SuppressWarnings("unchecked")
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) request.getAttribute("list");
		if (list.isEmpty() == false) {
	%>
	<table>
		<thead>
			<tr>
				<th>순번</th><th>상품명</th><th>등록일</th>
			</tr>
		</thead>
		<tbody>
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=i+1%></td>
			<td><a
				href="front?command=findProductById&pno=<%=list.get(i).getPno()%>"><%=list.get(i).getName()%></a></td>				
			<td><%=list.get(i).getRegDate()%></td>
		</tr>
		<%
			}
		%>
		</tbody>
	</table>
	<%
		} else {
	%>
	등록된 상품 정보가 없습니다
	<%
		}
	%>
</div>
</body>
</html>