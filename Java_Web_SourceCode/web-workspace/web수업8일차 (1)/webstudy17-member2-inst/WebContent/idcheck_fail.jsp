<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용불가</title>
<script type="text/javascript">
	function closeWindow(){
		opener.registerForm.id.value="";
		opener.registerForm.id.focus();
		opener.registerForm.flag.value="";
		self.close();
	}
</script>
</head>
<body bgcolor="orange" onunload="closeWindow()">
<%=request.getParameter("id") %>는 중복되어 
사용할 수 없습니다. <br><br>
<input type="button" value="확인" onclick="closeWindow()">
</body>
</html>




