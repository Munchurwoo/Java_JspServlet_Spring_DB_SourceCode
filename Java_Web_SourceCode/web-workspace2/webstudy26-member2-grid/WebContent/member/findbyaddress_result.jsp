<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty requestScope.list }">
			<script type="text/javascript">
				alert("${param.address}해당 지역에 사는 회원이 없습니다.");
				location.href = "index.jsp";
			</script>
		</c:when>
			<c:otherwise>
			<c:forEach items="${requestScope.list }" var="list">
		${list.id } ${list.name } <br>
	</c:forEach>
		</c:otherwise>
	</c:choose>
	<%-- 
	<c:forEach begin="0" end="${fn:length(list)}" var="in">
		<c:choose>
			<c:when test="${!empty requestScope.list }">
			${list[in].id } ${list[in].name }
		</c:when>
			<c:otherwise>
				<script type="text/javascript">
					alert("해당 지역에 사는 회원이 없습니다.");
					location.href = "index.jsp";
				</script>
			</c:otherwise>
		</c:choose>
	</c:forEach> --%>
</body>
</html>