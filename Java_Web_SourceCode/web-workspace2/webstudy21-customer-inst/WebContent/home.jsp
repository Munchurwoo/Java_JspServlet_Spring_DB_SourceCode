<%@page import="org.kosta.model.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/home.css">
<title>home</title>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp" />
		메인화면 <br><br>
		현재 고객수는
		<%=request.getAttribute("count")%>명입니다

	</div>
</body>
</html>





