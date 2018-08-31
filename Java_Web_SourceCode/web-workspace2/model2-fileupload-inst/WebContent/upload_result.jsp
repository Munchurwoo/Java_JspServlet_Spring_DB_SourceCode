<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록결과</title>
</head>
<body>
등록 완료 <br><br>
${requestScope.pvo.name}<br><br>
${requestScope.pvo.maker}<br><br>
${requestScope.pvo.picture}<br><br>
<img src="${pageContext.request.contextPath}/upload/${requestScope.pvo.picture}"><br>
</body>
</html>