<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step2-form.jsp</title>
</head>
<body>
<form action="step2-action.jsp" method="post">
	아이디 <input type="text" name="userId"><br>
	이름 <input type="text" name="userName"><br>
	<input type="submit" value="전송">
</form>
<%--
		step2-action.jsp 에서 
		아이디 : kim
		이름 : 김태리 
		와 같이 보여준다 
 --%>
</body>
</html>



















