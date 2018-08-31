<%@page import="org.kosta.model.MemberVO"%>
<%@page import="org.kosta.model.MemberDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
th, td {
	padding:10px;
}
</style>
</head>
<body>
	<%
		@SuppressWarnings("unchecked")
		ArrayList<MemberVO> list = (ArrayList<MemberVO>) request.getAttribute("list");
	%>
	<strong><%=request.getParameter("address")%>에 사는 맴버</strong>
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
				<td><%=list.get(i).getAddress()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>