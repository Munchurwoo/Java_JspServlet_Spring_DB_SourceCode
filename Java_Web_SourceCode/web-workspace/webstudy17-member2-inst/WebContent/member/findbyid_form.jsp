<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/front">
	<input type="hidden" name="command" value="findMemberById">
	아이디 <input type="text" name="id">
	<input type="submit" value="검색">
</form>
</body>
</html>