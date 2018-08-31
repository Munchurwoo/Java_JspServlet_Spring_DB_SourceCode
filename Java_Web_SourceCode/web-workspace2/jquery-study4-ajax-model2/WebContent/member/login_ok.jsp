<%@page import="org.kosta.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인성공</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <div class="row">
   <!-- offset: 2비중만큼 오른쪽으로 이동 -->
   <div class="col-sm-8 col-sm-offset-2">
<a href="${pageContext.request.contextPath}/index.jsp">홈</a><hr>
${sessionScope.memberDTO.name }님 로그인 성공! 
   </div>
  </div>
  <!--  row  -->
 </div>
 <!-- container --> 

</body>
</html>

















