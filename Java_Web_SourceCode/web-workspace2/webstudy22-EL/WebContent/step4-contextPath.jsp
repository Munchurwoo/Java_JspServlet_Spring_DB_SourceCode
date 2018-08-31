<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
<%-- 
	servletContext 를 jsp 에 활용 
 --%>
 <%=application.getInitParameter("adminEmail") %>
 ${initParam.adminEmail }<br>
 현 프로젝트 경로를 EL로 출력 ( 아주 많이 사용된다. )<br>
 ${pageContext.request.contextPath }
</body>
</html>