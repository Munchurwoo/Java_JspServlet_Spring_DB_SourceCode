<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp로 table 표현</title>
</head>
<body>
	<%
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("신현수", 29));
		list.add(new MemberVO("최요셉", 24));
		list.add(new MemberVO("문준위", 29));
	%>
	<table border="1" cellpadding="10">
	<thead>
		<tr>
			<th>번호</th><th>이름</th><th>나이</th>
		</tr>
	</thead>
	<tbody>
	<% for(int i=0;i<list.size();i++){ %>
		<tr>
			<td><%=i+1 %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getAge() %></td>
		</tr>
	<%} %>	
	</tbody>
	</table>
</body>
</html>




















