<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find_customer_fail.jsp</title>
</head>
<body>
<script type="text/javascript">
	alert("${param.id}아이디에 대한 회원 없음!");
	location.href="${pageContext.request.contextPath}/index.jsp";
</script>
</body>
</html>