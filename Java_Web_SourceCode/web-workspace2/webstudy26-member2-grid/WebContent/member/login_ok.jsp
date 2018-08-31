<%@page import="org.kosta.model.MemberDAO"%>
<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인결과</title>
</head>
<body>
<%
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		if(mvo!=null){
%>		  <%=mvo.getId() %>님 로그인 완료 	
	
<%		}else{ // 세션 내에 인증정보가 없으면 
			//로그인 폼 페이지로 이동시킨다 
			%>
				<input type="hidden" name="command" value="member_count">
			${count } <% 
		}
%>
</body>
</html>









