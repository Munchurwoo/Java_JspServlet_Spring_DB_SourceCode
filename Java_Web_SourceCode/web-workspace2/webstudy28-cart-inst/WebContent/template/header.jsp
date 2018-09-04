<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h4>
	<a href="${pageContext.request.contextPath}/front?command=Home">
		Model2 상품관리</a> &nbsp;&nbsp;
	<c:choose>
		<c:when test="${sessionScope.memberDTO==null }">
			<a
				href="${pageContext.request.contextPath}/front?command=BoardPostFormController">게시판</a>
	&nbsp;&nbsp;&nbsp;
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath}/front?command=CartView">장바구니
				보기</a>
			<a
				href="${pageContext.request.contextPath}/front?command=BoardPostFormDetailController">게시판</a>
		</c:otherwise>
	</c:choose>
</h4>