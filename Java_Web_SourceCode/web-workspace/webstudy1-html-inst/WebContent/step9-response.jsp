<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form 요청에 대한 응답</title>
</head>
<body background="아이유-배경화면.jpg">
<h3>클라이언트 요청에 대한 서정우 서버의 응답입니다. </h3>
사용자가 입력한 아이디 : <%=request.getParameter("userId") %>
<%=request.getParameter("command") %>
</body>
</html>










