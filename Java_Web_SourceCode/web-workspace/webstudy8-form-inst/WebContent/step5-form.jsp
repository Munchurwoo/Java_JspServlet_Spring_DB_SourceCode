<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select option</title>
</head>
<body>
<form method="post" action="step5-action.jsp">
	<select name="line" required="required">
		<option value="">--호선--</option>
		<%-- jsp 로 1호선부터 9호선까지 option을 생성한다 --%>
		<% for(int i=1;i<=9;i++){ %>
		<option value="<%=i%>"><%=i%>호선</option>
		<% } %>
	</select>
	<input  type="submit" value="선택">
</form>
<%-- step5-action.jsp 에서는 
	   1~4호선까지는 
	   코레일 3호선을 선택하셨습니다! 
	   5~9호선까지는
	   도시철도 7호선을 선택하셨습니다!	
 --%>
</body>
</html>










