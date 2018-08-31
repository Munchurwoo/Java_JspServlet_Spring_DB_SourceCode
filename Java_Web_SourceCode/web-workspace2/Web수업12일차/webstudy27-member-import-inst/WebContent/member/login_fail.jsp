<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login fail</title>
</head>
<body>
<script type="text/javascript">
	alert("로그인 실패!");
	location.href="${pageContext.request.contextPath}/index.jsp";
</script>
</body>
</html>













