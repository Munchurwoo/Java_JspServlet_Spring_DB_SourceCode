<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>board</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/board.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#updateForm").submit(function() {
			if ($("#title").val() == "") {
				alert("제목을 입력하세요!");
				return false;
			}
			if ($("#content").val() == "") {
				alert("본문을 입력하세요!");
				return false;
			}
		});
		$("#resetBtn").click(function() {
			$("#write_form")[0].reset();
		});
	});
</script>
</head>
<body>
	<!-- container-fluid: 화면 너비와 상관없이 항상 100% -->
	<div class="container-fluid">
		<div class="row header">
			<div class="col-sm-2"></div>
			<div class="col-sm-8" align="right">
				<c:import url="/WEB-INF/views/member/login.jsp"></c:import>
			</div>
			<div class="col-sm-2"></div>
		</div>
		<div class="row main">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<form method="post" id="updateForm"
					action="${pageContext.request.contextPath}/updatePost.do">
					<input type="hidden" name="no" value="${pvo.no}">
					<table class="table">
						<tr>
							<td>제목 &nbsp;&nbsp; <input type="text" name="title"
								value="${pvo.title}" required="required">
							</td>
						</tr>
						<tr>
							<td><textarea cols="90" rows="15" name="content"
									required="required">${pvo.content }</textarea></td>
						</tr>
					</table>
					<div class="btnArea">
						<button type="submit" class="btn">수정</button>
						<button type="reset" class="btn">취소</button>
					</div>					
				</form>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>












