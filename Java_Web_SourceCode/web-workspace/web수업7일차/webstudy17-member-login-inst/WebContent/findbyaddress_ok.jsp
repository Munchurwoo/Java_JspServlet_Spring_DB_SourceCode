<%@page import="org.kosta.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 결과</title>
<style type="text/css">
	th,td{
		padding: 10px;
	}
</style>
</head>
<body>
<%		@SuppressWarnings("unchecked")
		ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
		String address=request.getParameter("address");
%>	
<h3><%=address%>에 사는 회원 명단</h3>
<table border="1">
	<thead>
		<tr>
			<th>ID</th><th>NAME</th>
		</tr>
	</thead>
	<tbody>
		<% for(int i=0;i<list.size();i++){ %>
		<tr>
			<td><%=list.get(i).getId() %></td><td><%=list.get(i).getName() %></td>
		</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>


























