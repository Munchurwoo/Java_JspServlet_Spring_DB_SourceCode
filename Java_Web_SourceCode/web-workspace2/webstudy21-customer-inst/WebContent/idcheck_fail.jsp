<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디중복확인</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
<script type="text/javascript">
	var of = window.opener.document.registerForm;
	of.id.value = "";
	of.flag.value = "";
	function closeWindow() {
		of.id.focus();
		self.close();
	}
</script>
</head>
<body bgcolor="orange" onunload="closeWindow()">
	<%=request.getParameter("id")%>는 중복! 사용불가
	<br>
	<br>
	<input type="button" onclick="closeWindow()" value="확인">
</body>
</html>




















