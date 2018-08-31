<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox response</title>
</head>
<body>
<%-- <%=request.getParameter("angel") %> --%>
<%--
		현수엔젤 태리엔젤을 선택하셨습니다 
 --%>
 <%
 		String angel[]=request.getParameterValues("angel");	
 		for(int i=0;i<angel.length;i++){
 %>	<%=angel[i] %>	 			
 <%	} %>을 선택하셨습니다.
</body>
</html>









