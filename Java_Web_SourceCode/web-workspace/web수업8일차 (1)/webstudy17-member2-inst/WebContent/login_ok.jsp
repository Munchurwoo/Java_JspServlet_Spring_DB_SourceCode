<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인결과</title>
</head>
<body>
<a href="index.jsp">Home</a><hr>
<%
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		if(mvo!=null){
%>		  <%=mvo.getName() %>님 로그인 완료 	
		  <a href="cafe.jsp">카페가기</a>		  	
<%		}else{ // 세션 내에 인증정보가 없으면 
			//로그인 폼 페이지로 이동시킨다 
			response.sendRedirect("login_form.jsp");
		}
%>
</body>
</html>









