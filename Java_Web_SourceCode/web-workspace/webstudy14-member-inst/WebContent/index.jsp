<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mode2 연습</title>
</head>
<body>
<h3>Model2 MVC + Front Controller + Singleton + Factory Pattern</h3>
<%--	GetAllTotalCountController 
		FindMemberByIdController
		FindMemberListByAddressController 
 --%>
<a href="front?command=GetAllTotalCountController">전체 회원수 보기</a>
<hr>
<form method="get" action="front">
<input type="hidden" name="command" value="FindMemberByIdController">
아이디 <input type="text" name="memberId">
<input type="submit" value="검색">
</form>
 <hr>
 <form action="front">
 <input type="hidden" name="command" value="FindMemberListByAddressController">
 주소 <input type="text" name="address" required="required">
 <input type="submit" value="검색">
 </form>
 <hr>
 <img src="model2.png">
</body>
</html>















