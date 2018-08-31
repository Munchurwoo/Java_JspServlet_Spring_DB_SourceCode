<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step3-form.jsp</title>
</head>
<body>
<form action="step3-action.jsp" method="post">
이름 <input type="text" name="userName" ><br>
나이 <input type="text" name="userAge"><br>
<input type="submit" value="입장하기">
</form>
<%--		step3-action.jsp 에서 나이가 19세 이상이면 
			24세 최요셉님 입장 환영 
			19세 미만이면 
			18세 신현수 입장불가
 --%>
</body>
</html>










