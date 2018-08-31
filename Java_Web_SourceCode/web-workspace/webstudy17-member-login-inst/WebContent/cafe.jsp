<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페</title>
</head>
<body>
<%
	MemberVO mvo=(MemberVO)session.getAttribute("mvo");
	if(mvo!=null){
%>
<a href="index.jsp">Home</a>
<hr>
<%=mvo.getAddress() %>에 사는 <%=mvo.getName() %>님
카페 입장을 환영합니다 <br>
<a href="front?command=logout">로그아웃</a>
<%	}else{ //로그인 상태가 아니면 
		response.sendRedirect("index.jsp");
	}
%>
</body>
</html>








