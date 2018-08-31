<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
</head>
<body>
	<a href="index.jsp">Home</a>
	<hr>
	<%
		MemberVO vo = (MemberVO) request.getAttribute("memberVO");
	%>
	아이디 : <%=vo.getId() %><br>
	이름 : <%=vo.getName() %><br>
	주소 : <%=vo.getAddress() %>
</body>
</html>