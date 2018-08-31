<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step3-action.jsp</title>
</head>
<body>
	<%
		//post방식 한글처리 
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("userName");
		//연산을 위해 정수형으로 변환한다 
		int age = Integer.parseInt(request.getParameter("userAge"));
		if (age >= 19) {
	%>		<%=age %>세 <%=name %>님 입장환영!
	<%
		} else {
	%>
			<%=age %>세 <%=name %>님 입장불가! 
	<%
		}
	%>
</body>
</html>








