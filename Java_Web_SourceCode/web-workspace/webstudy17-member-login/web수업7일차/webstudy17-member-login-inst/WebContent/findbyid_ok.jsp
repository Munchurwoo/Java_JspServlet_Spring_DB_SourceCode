<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
</head>
<body>
<%
		MemberVO vo=(MemberVO)request.getAttribute("vo");
%>
<a href="index.jsp">Home</a>
<hr>
<h3>회원 검색 결과</h3>
아이디 <%=vo.getId() %><br>
이름 <%=vo.getName() %><br>
주소 <%=vo.getAddress() %>
</body>
</html>













