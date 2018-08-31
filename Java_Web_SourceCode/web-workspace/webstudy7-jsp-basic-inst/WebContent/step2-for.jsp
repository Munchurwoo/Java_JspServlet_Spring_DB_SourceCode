<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp for loop</title>
</head>
<body>
	<%-- jsp 를 사용해 아래 구문을 10번 출력되게 한다
		1. 신현수 반장 
		2. 신현수 반장 
		...
		10. 신현수 반장 
 --%>
	<%
		for (int i = 1; i <= 10; i++) {
	%>
	<%=i %>. 신현수 반장 <br>
	<%
		}
	%>

</body>
</html>










