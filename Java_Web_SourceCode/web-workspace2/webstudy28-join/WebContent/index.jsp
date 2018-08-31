<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>join sql 연습</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">	
			<br><br>
			<h3>사원과 부서테이블을 이용하는 예제</h3>
			<br>
			<%-- EmployeeListController가 실행된다 
					사원번호 내림차순으로 정렬해본다
			--%>
			<a href="front?command=EmployeeList">사원목록보기(부서정보포함)</a>
			<br><br>
			<%-- RegisterEmployeeFormController가 실행된다 --%>
			<a href="front?command=RegisterEmployeeForm">사원등록폼</a>
		</div>
		<div class="col-sm-2"></div>	
	</div>
</div>
</body>
</html>