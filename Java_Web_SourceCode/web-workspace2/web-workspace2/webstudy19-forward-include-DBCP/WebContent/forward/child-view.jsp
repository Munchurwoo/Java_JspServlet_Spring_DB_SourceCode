<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<title>child-view.jsp</title>
</head>
<body>
<div class="container">
	<h3>미성년 전용 페이지</h3>
	<%=request.getParameter("userName") %>님
	<%=request.getParameter("userAge") %>세이므로 미성년자 전용페이지로 이동했습니다.
	<%=request.getParameter("command") %>
</div>
</body>
</html>