<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-action.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%> 이름 : <%=request.getParameter("userName") %><br>
	장르 : <%=request.getParameter("genre") %>
</body>
</html>











