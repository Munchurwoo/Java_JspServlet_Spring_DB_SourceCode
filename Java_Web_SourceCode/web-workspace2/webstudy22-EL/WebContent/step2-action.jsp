<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	1. 기존방식 파라미터 출력
	<%=request.getParameter("userId")%><br>
	<%
		//http 기반으로 데이터를 전달받으면 text 기반이므로 
		//정수형으로 변환해서 연산한다. 
		int age = Integer.parseInt(request.getParameter("userAge"));
	%>
	<%=age - 1%>
	<% String name=null; 
			request.setAttribute("testName", name);
			request.getAttribute("testName");
	%>
	<%=name %>
	2. EL 방식 파라미터 출력 ${param.userId }<br>
	<%-- EL은 별도의 형변환이 필요없다. 또한 NULL 일 경우 화면에 출력 X --%>
	${param.userAge-1 }
	${requestScope.textName }
</body>
</html>