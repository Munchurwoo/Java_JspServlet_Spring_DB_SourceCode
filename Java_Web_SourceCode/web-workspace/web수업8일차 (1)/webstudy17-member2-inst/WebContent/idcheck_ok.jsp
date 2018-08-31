<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용가능</title>
<script type="text/javascript">
	function closeWindow(){		
		opener.registerForm.flag.value="<%=request.getParameter("id")%>";
		self.close();
	}
</script>
</head>
<body bgcolor="yellow" onunload="closeWindow()">
<%=request.getParameter("id") %>아이디 사용가능 <br><br>
<input type="button" value="확인" onclick="closeWindow()">
</body>
</html>




