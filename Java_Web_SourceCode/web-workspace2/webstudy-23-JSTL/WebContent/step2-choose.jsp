<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head> 
<title>Insert title here</title>
</head>
<body>
<%--
	jstl 의 choose ~ when ~ otherwise 는 
	java의 if ~ else if ~else
 --%>
 <% 
 	request.setAttribute("person", new PersonVO("류현진",26));
 %>
 	${requestScope.person.name}<br>
 	${person.age }<br>
 	<c:choose>
 		<c:when test="${requestScope.person.name=='박보검' }">${requestScope.person.name } 배우입니다.</c:when>
 		<c:when test="${person.name=='류현진' }">${person.name } 야구 선수입니다.</c:when>
 		<c:otherwise>else 영역입니다.</c:otherwise>
 	</c:choose>
</body>
</html>