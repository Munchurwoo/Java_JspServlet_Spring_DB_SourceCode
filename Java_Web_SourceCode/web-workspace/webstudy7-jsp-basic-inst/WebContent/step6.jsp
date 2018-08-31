<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error.jsp"%>
 <%-- errorPage="error.jsp" 현재 페이지에서 에러가 나면
 	    지정한 error.jsp로 응답하게 한다 
  --%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@directive 지시자 </title>
</head>
<body>
<% String age="스물"; 
	// 아래 코드에서 Exception 발생 
	int i=Integer.parseInt(age);
%> <%=i+1 %>
</body>
</html>





