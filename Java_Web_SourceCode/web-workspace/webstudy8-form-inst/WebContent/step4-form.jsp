<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 연동테스트</title>
</head>
<body>
<form action="step4-action.jsp" method="post">
이름 <input type="text" name="userName" required="required"><br>
<input type="radio" name="genre" value="발라드" required="required">발라드 <br>
<input type="radio" name="genre" value="힙합"  required="required">힙합 <br>
<input type="radio" name="genre" value="댄스"  required="required">댄스 <br>
<input type="submit" value="전송">
</form>
<%--	이름 : 황성진
		장르 : 댄스 
 --%>
</body>
</html>








