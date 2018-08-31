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
<script type="text/javascript">
	alert("${param.id } : 아이디 조회 실패");
	location.href="${pageContext.request.contextPath}/index.jsp"
</script>
	${param.id } : 아이디 조회 실패
</body>
</html>