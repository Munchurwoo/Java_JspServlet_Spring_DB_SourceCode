<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- JSTL을 사용하기 위한 선언부 --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<c:if test="true">
	jstl if 문 실행 test에는 조건식 표현을 명시한다.
	</c:if>
	<hr>
	<c:if test="flase">
			jstl if 문 실행 false 명시한다.
	</c:if>
	<a href="step1-if.jsp?command=jstl&price=20">현 페이지를 다시 호출</a><br>
	<c:if test="${param.command=='jstl' && param.price>=20}">
	if test ${param.command } ${param.price }
	</c:if>
</body>
</html>