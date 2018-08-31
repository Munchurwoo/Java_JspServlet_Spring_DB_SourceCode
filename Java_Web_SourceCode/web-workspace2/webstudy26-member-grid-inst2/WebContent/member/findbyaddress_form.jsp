<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyaddress_form.jsp</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/front">
<input type="hidden" name="command" value="findMemberListByAddress">
주소 <input type="text" name="address">	
<input type="submit" value="회원검색">
</form>
<%--		member/findbyaddress_result.jsp
			에서 주소에 대한 회원이 1명 이상 있으면 
			판교에 사는 회원명단 
			회원리스트를 제공한다 
			없으면 
			alert으로 판교에 사는 회원이 없습니다. 후 
			index.jsp로 이동 
 --%>
</body>
</html>





















