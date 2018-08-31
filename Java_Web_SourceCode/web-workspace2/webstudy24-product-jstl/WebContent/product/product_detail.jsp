<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/home.css">
<script type="text/javascript">
	function pDelect() {
		/*
			삭제, 수정, 생성은 http request method 중 post 방식으로 진행
		*/
		if (confirm("삭제할래?")) {
			document.getElementById("delectForm").submit();
		}
	}
</script>
<head>

<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/front" method="post" id="delectForm">
	<input type="hidden" name="command" value="findDeleteById">
	<input type="hidden" name="pno" value="${dto.pno}">
</form>
	<div class="container">
		<table>
			<tr>
				<td>번호</td>
				<td>${dto.pno}</td>
			</tr>
			<tr>
				<td>제품명</td>
				<td>${dto.name }</td>
			</tr>
			<tr>
				<td>제조사</td>
				<td>${dto.maker}</td>
			</tr>
			<tr>
				<td>등록시간</td>
				<td>${dto.regDate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="삭제"
					onclick="pDelect()"></td>
			</tr>
		</table>
	</div>
</body>
</html>