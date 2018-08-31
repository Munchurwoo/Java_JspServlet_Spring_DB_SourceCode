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
	<%
		//컨트롤러에서 현재 페이지번호를 전달했다고 가정 
		request.setAttribute("nowPage", 3);
	%>
	<%--
	nowPage 링크를 부여 않고 나머지 페이지는 링크를 부여한다. 
 --%>
	<c:forEach begin="1" end="8" var="pageNo">
		<c:choose>
			<c:when test="${requestScope.nowpage }!=pageNo">
				<a href="">${pageNo }</a> &nbsp;&nbsp;&nbsp;
			</c:when>
			<c:otherwise>
				${pageNo }
		</c:otherwise>
		</c:choose>
	</c:forEach>
					<a href="">aa</a>
	
</body>
</html>