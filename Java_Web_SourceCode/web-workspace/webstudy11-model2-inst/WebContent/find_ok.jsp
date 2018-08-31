<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
</head>
<body bgcolor="yellow">
<a href="index.jsp">home</a>
<hr>
<%-- ControllerServlet이 공유한 검색정보를 
	   클라이언트에게 제공한다 
 --%>
검색 결과 : <%=request.getAttribute("result") %>
</body>
</html>








