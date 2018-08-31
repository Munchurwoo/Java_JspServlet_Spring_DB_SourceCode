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
		ArrayList<ProductVO> list = (ArrayList<ProductVO>) request.getAttribute("list");
	%>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getId()%></td>
				<td>
				<a href="front?command=findMemberById&id=<%=list.get(i).getId()%>"><%=list.get(i).getName()%></a>
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>






</html>