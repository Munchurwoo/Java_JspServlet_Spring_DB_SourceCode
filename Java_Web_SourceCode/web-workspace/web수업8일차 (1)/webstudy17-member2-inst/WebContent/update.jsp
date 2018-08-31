<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수정</title>
</head>
<body>
<%
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		if(mvo!=null){
%>
<form method="post" action="front">
<input type="hidden" name="command" value="updateMember">
<%-- 세션에 있는 인증정보(MemberVO)를 이용해 
	   회원정보를 제공한다 
	   아이디는 수정대상이 아니므로 readonly 속성을 준다 	
  --%>
아이디 <input type="text" name="id" value="<%=mvo.getId()%>" readonly="readonly"><br>
패스워드 <input type="text" name="password"
 value="<%=mvo.getPassword()%>"  required="required"><br>
이름 <input type="text" name="name" value="<%=mvo.getName()%>" required="required"><br>
주소 <input type="text" name="address" value="<%=mvo.getAddress()%>" required="required"><br>
<input type="submit" value="수정">
</form>
<%	}else{ 
		response.sendRedirect("index.jsp");
	}
%>
</body>
</html>














