<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
	function closeWindow(){
		opener.docment.userInfo.id.value="";	
		opener.docment.userInfo.id.focus();	
		opener.docment.userInfo.flag.value="";	
		self.close();
	}
	</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onunload="closeWindow()">
	<h3><%=request.getParameter("id")%>는 중복된 아이디 입니다.</h3><br>
	<input type="button" value="창 닫기" onclick="closeWindow()">
	
</body>
</html>