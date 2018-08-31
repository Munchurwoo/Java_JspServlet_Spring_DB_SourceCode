<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<title>forward-action.jsp</title>
</head>
<body>
<div class="container">
<%	 String name = request.getParameter("userName");
	int age = Integer.parseInt(request.getParameter("userAge"));
	if(age>18){
%>
		<%=name %>님 <%=age %>세 성인입니다
<%}else{ %>
		<%-- child-view.jsp에서 view를 제공하도록 이동시킨다 --%>
		<jsp:forward page="child-view.jsp">
			<jsp:param value="parameter" name="command"/>
		</jsp:forward>
<%} %>

</div>
</body>
</html>