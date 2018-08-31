<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  session="false"%>
<%-- 위와 같이 directive 영역에 session="false"를 명시하면 
	   jsp가 java로 생성될 때 웹컨테이너가 session 선언 및 초기화
	   관련 코드는 제외한다 
 --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test2.jsp</title>
</head>
<body>
<form action="SetSession">
이름 <input type="text" name="userName">
<input type="submit" value="세션테스트2">
</form>
<%-- session test --%>
<%
//위의 설정으로 session 관련 코드는 생성되지 않으므로 에러가 안난다
		String session=""; 
	// String application="";// ServletContext 타입으로 선언 및 초기화 
%>
</body>
</html>









