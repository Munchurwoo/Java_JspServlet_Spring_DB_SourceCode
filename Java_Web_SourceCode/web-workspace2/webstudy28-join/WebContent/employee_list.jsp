<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>사원목록</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<br><br>	
			<a href="index.jsp">Home</a>
			<br><br>
			<table class="table">
				<tr>
					<th>사원번호</th><th>사원명</th><th>월급</th>
					<th>부서번호</th><th>부서명</th><th>지역</th><th>TEL</th>
				</tr>				
				<%-- JSTL forEach를 이용해서 사원과 부서정보를제공 --%>
				<c:forEach items="${requestScope.list}" var="employee">
				<tr>
					<th>${employee.empno }</th><th>${employee.ename}</th><th>${employee.sal }</th>
					<th>${employee.departmentVO.deptno }</th><th>${employee.departmentVO.dname }</th><th>${employee.departmentVO.loc}</th><th>${employee.departmentVO.tel}</th>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div class="col-sm-2"></div>	
	</div>
</div>
</body>
</html>