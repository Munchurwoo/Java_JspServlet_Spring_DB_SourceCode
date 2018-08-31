<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid_fail.jsp</title>
</head>
<body>
<script type="text/javascript">
	alert("<%=request.getParameter("memberId")%>아이디에 해당하는 회원이 없습니다");
	location.href="index.jsp";
</script>
</body>
</html>










