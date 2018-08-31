<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>사원등록폼</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">	
			<a href="index.jsp">Home</a>
			<br><br>
			<h5>사원등록</h5>
			<br>			
			
			<%--		입력폼 
						사원명
						월급
						부서 (select option 으로 db table department에 존재하는 부서명을 제공, 전송시에는 pk인 부서번호가 전달) 
			 --%>
			 <form action="front" method="post">
			 <input type="hidden" name="command" value="RegisterEmployee">
			 <table class="table">
			 	<tr>
			 		<th>사원명</th><th><input type="text" name="employeeName"></th>
			 	</tr>			 	
			 	<tr>
			 		<th>월급</th><th><input type="text" name="employeeSal"></th>
			 	</tr>
			 	<tr>
			 		<th>부서</th>
			 		<th>
			 			<select name="department">
			 				<option>--부서--</option>
			 				<option value="10">전략기획</option>
			 				<option value="20">공공사업</option>
			 				<option value="30">해양수산</option>
			 			</select>
			 		</th>
			 	</tr>
			 	<tr>
			 		<th><input type="submit" value="등록"></th>
			 		<th></th>
			 	</tr>
			 </table>
			 </form>
		</div>
		<div class="col-sm-2"></div>	
	</div>
</div>
</body>
</html>