<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Model2 회원관리 + jQuery Ajax</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<!-- offset: 2비중만큼 오른쪽으로 이동 -->
			<div class="col-sm-8 col-sm-offset-2">
				<h4>Model2 회원관리+ jQuery Ajax</h4>
				<br> <a
					href="${pageContext.request.contextPath}/member/findMemberById.jsp">아이디로
					회원검색</a> <br> <a
					href="${pageContext.request.contextPath}/front?command=findKindOfAddress">주소로
					검색</a> <br>
				<c:choose>
					<c:when test="${sessionScope.memberDTO==null}">
						<a href="${pageContext.request.contextPath}/member/login.jsp">로그인</a>
						<br>
						<a href="${pageContext.request.contextPath}/member/register.jsp">회원가입</a>
					</c:when>
					<c:otherwise>
			${sessionScope.memberDTO.name}님 로그인<br>
						<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<!--  row  -->
	</div>
	<!-- container -->

</body>
</html>







