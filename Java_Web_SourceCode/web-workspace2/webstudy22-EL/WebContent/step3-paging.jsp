<%@page import="model.TestVO"%>
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
	<!-- 컨트롤러에서 현재 view jsp 에 공유되었다고 가정  -->
	<%TestVO vo =new TestVO();
		request.setAttribute("vo", vo);
	%>
	<%TestVO tvo =(TestVO)request.getAttribute("vo"); %>
	<%=	vo.getName() %>
	<%--
		el로 class VO에 접근 
		get 계열 메서드에 접근 가능
		is 계열 메서드에 접근 가능 
	 --%>
	${vo.name}<%--   ${vo.findNick }  --%>
	${vo.person }
</body>
</html>