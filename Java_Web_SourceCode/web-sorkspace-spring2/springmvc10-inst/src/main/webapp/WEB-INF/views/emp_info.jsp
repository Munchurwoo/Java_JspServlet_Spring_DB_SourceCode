<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>emp list</title>
</head>
<body>
<div class="container">
  <h4>사원 정보</h4>  
   <table class="table table-bordered">
    <thead>
      <tr>
        <th>사원번호</th>
        <th>사원명</th>
        <th>직종</th>
        <th>부서번호</th>
        <th>부서명</th>
        <th>지역</th>
      </tr>
    </thead>
    <tbody>    
      <tr>
        <td>${emp.empNo}</td>
        <td>${emp.ename}</td>
        <td>${emp.job}</td>
        <td>${emp.deptVO.deptNo}</td>
        <td>${emp.deptVO.dname}</td>
        <td>${emp.deptVO.loc}</td>
      </tr>     
    </tbody>
  </table>
</div>
</body>
</html>