<%@page import="model.PageingBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	/* 링크 언더바 없앰 */
	a{
		text-decoration: none;
	}
	.nowPage{
		color:lime;
	}
</style>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		PageingBean pb = new PageingBean();
		pb.setStartPage(10);
		pb.setEndPage(19);
		pb.setNowPage(15);
		request.setAttribute("paging", pb);
	%>
	<%--
		아래에서 jstl로 시작페이지 ~ 마지막 페이지를 표현 
		현재 페이지는 링크 제외 
	 --%>
	<c:forEach begin="${requestScope.paging.startPage }"
		end="${requestScope.paging.endPage }" var="pageNo">
	<c:choose>
		<c:when test="${requestScope.paging.nowPage!=pageNo }">
			<a href="">${pageNo }</a> &nbsp;
		</c:when>
		<c:otherwise>
	 	<span class="nowPage">${pageNo }</span> &nbsp;
	 	</c:otherwise>
	</c:choose>
	</c:forEach>
</body>
</html>