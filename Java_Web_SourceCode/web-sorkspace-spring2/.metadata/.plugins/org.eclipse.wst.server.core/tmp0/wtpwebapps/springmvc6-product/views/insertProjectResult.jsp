<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h3>상품정보</h3>
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
				<tr>
					<td>${vo.productNo }</td>
					<td>${vo.name }</td>
					<td>${vo.maker }</td>
					<td>${vo.price }</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>