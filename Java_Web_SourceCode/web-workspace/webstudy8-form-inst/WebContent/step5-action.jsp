<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-action.jsp</title>
</head>
<body>
<%
		int line=Integer.parseInt(request.getParameter("line"));
	    String name=null;
	    if(line<5){
	    	name="코레일";
	    }else{
	    	name="도시철도";
	    }
%>
<%=name%> <%=line %>호선을 선택하셨습니다!
</body>
</html>














