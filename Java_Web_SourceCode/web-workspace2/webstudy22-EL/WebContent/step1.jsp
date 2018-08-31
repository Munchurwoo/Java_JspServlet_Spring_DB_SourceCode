<%@page import="model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>EL</title>
</head>
<body>
	<%
		request.setAttribute("userName", "김태리");
		request.setAttribute("car", new CarVO("SM5", 100));
	%>
	1. 기존방식
	<%=request.getAttribute("userName")%><br>
	request에 있는 car의 model을 출력 :
	<%
		CarVO vo =(CarVO) request.getAttribute("car"); 
	%>
	<%=vo.getModel() %>
	<br>
	2. EL로 표현 ${userName }	<br>
	${car.model } <br>
	requestScope.car.model 방식을 선호! &nbsp;
	${requestScope.car.model }

</body>
</html>