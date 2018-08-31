<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step2-action.jsp</title>
</head>
<body>
<%		//post 방식 한글처리 
		request.setCharacterEncoding("utf-8");
%>
아이디 : <%=request.getParameter("userId") %> <br>
이름 : <%=request.getParameter("userName") %>
</body>
</html>










