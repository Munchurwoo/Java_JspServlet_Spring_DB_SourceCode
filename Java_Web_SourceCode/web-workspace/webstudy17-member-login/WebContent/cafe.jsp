<%@page import="org.kosta.model.MemberDAO"%>
<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%MemberVO mvo = (MemberVO)session.getAttribute("vo");
	if(mvo!=null){%>
	<a href="index.jsp"></a>
	<hr>
	<%=mvo.getAddress()%>에 사는 <%=mvo.getName()%>님 카페 입장 환영
	<a href="LogoutController.jsp">로그아웃</a>
	<%}else{
		response.sendRedirect("LogoutController");
	}
	%>
</body>
</html>