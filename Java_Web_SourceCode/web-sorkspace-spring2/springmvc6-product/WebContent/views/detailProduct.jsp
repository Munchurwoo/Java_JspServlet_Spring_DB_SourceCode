<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<br>
<br>
<br>


<div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
        <th>상품번호</th>
        <th>상품명</th>
        <th>제조사</th>
        <th>가격</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
      <tr>
        <td>상품번호 : ${list.productNo}</td>
        <td>상품명 : ${list.name}</td>
        <td>제조사 : ${list.maker}</td>
        <td>상품가격 : ${list.price}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>