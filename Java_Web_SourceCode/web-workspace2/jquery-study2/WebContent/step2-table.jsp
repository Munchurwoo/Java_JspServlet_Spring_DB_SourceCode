<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>jquery table</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#testBtn").click(function() {
			//alert($(this).val());
			//$("#friend tr").css("background","yellow");
			//alert($("#friend tr").text());
			//alert($("#friend tr").html());
			$("#friend td:eq(2)").css("background","yellow");
			/* $("#friend td:contains(당)").css("background","yellow");
			alert($("#friend td:contains(당)")); */
		$("#friend td").click(function() {
		})// testBtn click event 
			//클릭된 td 의 부모(tr)로 이동해서 자식 td 중 첫번째 요소의 
			// 텍스트를 출력 
			alert("클릭됨");
			alert($(this).parent.children.eq(0).text());
		});
	});
</script>
</head>
<body>

	<div class="container">
		<input type="button" value="테스트" id="testBtn">
		<p>jquery로 table 제어</p>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>이름</th>
					<th>나이</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody id="friend">
				<tr>
					<td>아이유</td>
					<td>28</td>
					<td>동탄</td>
				</tr>
				<tr>
					<td>김연아</td>
					<td>24</td>
					<td>사당</td>
				</tr>
				<tr>
					<td>김태리</td>
					<td>27</td>
					<td>분당</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>