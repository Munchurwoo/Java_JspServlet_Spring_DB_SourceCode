<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수</title>
</head>
<body>
<%--
			model.MemberDAO 를 이용해 
			클라이언트의 요청에 대한 응답을 한다 
 --%>
 <%  
 	  int totalCount=MemberDAO.getInstance().getMemberTotalCount();	
 %>
총회원수는 <%=totalCount %>명 입니다. 
</body>
</html>







