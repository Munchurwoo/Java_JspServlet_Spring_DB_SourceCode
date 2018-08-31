<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select option</title>
<script type="text/javascript">
	function sendLine(){
		// 서버로 form data를 전송한다 
		document.getElementById("subway").submit();
	}
</script>
</head>
<body>
<%--
			사용자가 select option 을 변경하여 선택할 때 
			서버로 전송되도록 javascript를 이용해 구현 
 --%>
<form method="post" action="step5-action.jsp" id="subway">
	<select name="line" required="required" onchange="sendLine()">
		<option value="">--호선--</option>		
		<% for(int i=1;i<=9;i++){ %>
		<option value="<%=i%>"><%=i%>호선</option>
		<% } %>
	</select>	
</form>
<%-- step5-action.jsp 에서는 
	   1~4호선까지는 
	   코레일 3호선을 선택하셨습니다! 
	   5~9호선까지는
	   도시철도 7호선을 선택하셨습니다!	
 --%>
</body>
</html>










