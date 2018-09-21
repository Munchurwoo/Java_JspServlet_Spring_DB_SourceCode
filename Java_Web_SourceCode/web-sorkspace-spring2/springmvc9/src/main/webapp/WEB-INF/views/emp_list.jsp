<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
  <h2>사원명단</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>사원번호</th>
        <th>사원명</th>
        <th>직종</th>
        <th>부서번호</th>
      </tr>
    </thead>	
    <tbody>
      <c:forEach items="${emp}" var="emp">
      <tr>
        <td>${emp.empNo }</td>
        <td>${emp.ename }</td>
        <td>${emp.job }</td>
        <td>${emp.deptNo }</td>
      </tr>
        </c:forEach>

    </tbody>
  </table>
</div>
</body>
</html>