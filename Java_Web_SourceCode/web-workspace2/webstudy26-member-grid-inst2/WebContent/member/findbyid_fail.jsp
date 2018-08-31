<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 fail</title>
</head>
<body>
<script type="text/javascript">
	alert("${param.id} 아이디 회원은 존재하지 않습니다");
	location.href="${pageContext.request.contextPath}/front?command=home";
</script>
</body>
</html>