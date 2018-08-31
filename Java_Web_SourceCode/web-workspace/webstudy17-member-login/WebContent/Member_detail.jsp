<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberVO vo = (MemberVO) request.getAttribute("MemberVO");
	%>
	<table border="1">
		회원님의 아이디 :<%=vo.getId()%>
		<tr>
			<td>아이디</td>
			<td><%=vo.getId()%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=vo.getName()%></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=vo.getAddress()%></td>
		</tr>

	</table>
</body>
</html>