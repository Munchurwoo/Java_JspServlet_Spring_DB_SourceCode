<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update_result.jsp</title>
</head>
<body>
<%
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		if(mvo!=null){
%>		 
		<a href="index.jsp">Home</a><hr>
		<h3>회원정보가 수정되었습니다</h3>	
		 ID : <%=mvo.getId() %><br>
		 NAME : <%=mvo.getName() %><br>
		 ADDRESS : <%=mvo.getAddress() %>	
<%		}else{
			response.sendRedirect("index.jsp");
		}	
%>

</body>
</html>










