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
	<a href="index.jsp">home</a>
	<% MemberVO mvo = (MemberVO)session.getAttribute("mvo");
	   if(mvo!=null){%>
	   <h3>회원정보를 수정 완료 했습니다!</h1><br>
	   <h3>수정 정보</h3>
	   아이디 : <%=mvo.getId()%>
	   패스워드 : <%=mvo.getPassword() %>
	   이름 : <%=mvo.getName() %>
	   주소 : <%=mvo.getAddress() %>
	   <% }else{
		   response.sendRedirect("login_form.jsp");
	   }
	%>
</body>
</html>