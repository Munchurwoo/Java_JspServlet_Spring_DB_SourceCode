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

	<% 
	int count=0;
	if(request.getAttribute("count")!=null){%>
		<%=request.getAttribute("count") %>	
	<%} else{%>
	<%=count %>
	<%} %>
</body>
</html>