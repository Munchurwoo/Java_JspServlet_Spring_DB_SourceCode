<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:choose>
<c:when test="${sessionScope.mvo==null}">
	<script type="text/javascript">
			alert("로그인 실패!");
			location.href="${pageContext.request.contextPath}/list.do";
	</script>
</c:when>
<c:otherwise>
		<script type="text/javascript">
			alert("${sessionScope.mvo.name}님 로그인 ok!");
			location.href="${pageContext.request.contextPath}/list.do";
		</script>		
</c:otherwise>
</c:choose>















