<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-action.jsp</title>
<style type="text/css">
	th,td{
		padding: 10px;
	}
</style>
</head>
<body>
<%		request.setCharacterEncoding("utf-8");
		String fa[]=request.getParameterValues("food");
%>
<table border="1">
	<thead>
		<tr>
			<th>순번</th><th>메뉴명</th>
		</tr>
	</thead>
	<tbody>
	<% for(int i=0;i<fa.length;i++){ %>
		<tr>
			<td><%=i+1%></td><td><%=fa[i]%></td>
		</tr>
	<%} %>	
	</tbody>
</table>
</body>



</html>