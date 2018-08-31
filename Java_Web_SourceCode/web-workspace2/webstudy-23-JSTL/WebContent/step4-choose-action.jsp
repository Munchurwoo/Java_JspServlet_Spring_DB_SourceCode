<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.age>=19} ">
 			${param.name }님 ${param.age}세 성인입니다.
 		</c:when>
		<c:when test=" ${param.age>=13}">
 			${param.name }님 ${param.age}세 청소년입니다.
 		</c:when>
		<c:when test="${param.age =>1}">
 		${param.name }님 ${param.age}세 어린이 입니다.
 		</c:when>
		<c:otherwise>
 		${param.name }님 출생전입니다.
 		</c:otherwise>
	</c:choose>
</body>
</html>
<%-- 
		tep4-choose-action.jsp 에서는 19세 이상이면 아이유님 26세 성인입니다 
		13세 이상이면 아이유님 15세 청소연입니다. 
		1세~13세 미만이면 
		아이유님 11세 어린이 입니다. 
		1세 미만이면 
		아이유님 출생전입니다. 
	 --%>