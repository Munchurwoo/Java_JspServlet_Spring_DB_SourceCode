<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 실패</title>
<link rel="stylesheet" type="text/css" href="css/css.css">

</head>
<body>

<script type="text/javascript">
	alert("${param.id} 로그인 실패");
	location.href="${pageContext.request.contextPath}/index.jsp";
</script>
</body>
</html>







