<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/home.css">
<head>
<title>Insert title here</title>
</head>
<body>
				

	<div class="container">상품목록화면</div>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>상품명</th>
				<th>등록일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${list }" var="list" >
			<tr>
					<td>${list.pno }</td>
					<td><a href="front?command=findProductById&pno=${list.pno }">${list.maker }</a></td>
					<td>${list.regDate }</td>
					<td><a href="front?command=findDeleteById&pno=${list.pno }">${list.maker } ->제품 삭제</a></td>
			</tr><br>
				</c:forEach>
		</tbody>
	</table>
</body>
</html>