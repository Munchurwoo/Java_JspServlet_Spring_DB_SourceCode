<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyaddress_result.jsp</title>
</head>
<body>
<c:choose>
	<c:when test="${empty requestScope.list}">
		<script type="text/javascript">
			alert("${param.address}에 사는 회원이 존재하지 않습니다");
			location.href="index.jsp";
		</script>
	</c:when>
	<c:otherwise>
		${param.address}에 사는 회원 명단 <br><br>
		<c:forEach items="${requestScope.list}" var="m">
			${m.id} ${m.name}<br>
		</c:forEach>
	</c:otherwise>
</c:choose>
<%--		member/findbyaddress_result.jsp
			에서 주소에 대한 회원이 1명 이상 있으면 
			판교에 사는 회원명단 
			회원리스트(아이디,이름)를 제공한다 
			없으면 
			alert으로 판교에 사는 회원이 없습니다. 후 
			index.jsp로 이동 
 --%>
</body>
</html>




