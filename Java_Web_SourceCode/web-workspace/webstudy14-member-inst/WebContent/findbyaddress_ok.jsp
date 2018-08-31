<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
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
<%		@SuppressWarnings("unchecked")
		ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
%>
<%=request.getParameter("address") %>에 사는 회원 명단 <br><br>
<% for(int i=0;i<list.size();i++){ %>
	<%=i+1%>. <%=list.get(i).getId() %> <%=list.get(i).getName() %><br>
<%} %>
</body>
</html>