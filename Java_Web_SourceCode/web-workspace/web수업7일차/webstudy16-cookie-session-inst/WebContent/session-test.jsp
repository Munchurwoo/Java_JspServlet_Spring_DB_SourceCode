<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test.jsp</title>
<script type="text/javascript">
	function executeLogout(){
		//alert("logout");
		location.href="LogoutServlet";
	}
</script>
</head>
<body>
<form action="SetSession">
이름 <input type="text" name="userName">
<input type="submit" value="세션테스트">
</form>
<hr>
<input type="button" value="로그아웃" onclick="executeLogout()">
<%-- session test --%>
<%
//jsp 가 java 로 생성될 때 이미 선언 및 초기화되어 있어 변수명 중복되므로
// error 
	//	String session=""; // HttpSession 타입으로 선언 및 초기화 
	// String application="";// ServletContext 타입으로 선언 및 초기화 
%>
</body>
</html>









