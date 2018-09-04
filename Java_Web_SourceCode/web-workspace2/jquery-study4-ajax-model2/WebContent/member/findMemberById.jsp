<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>회원검색</title>

</head>
<body>
	<div class="container">
		<div class="row">
			<!-- offset: 2비중만큼 오른쪽으로 이동 -->
			<div class="col-sm-8 col-sm-offset-2">
				<script type="text/javascript">
				$(document).ready(function() {
					$("#findMemberBtn").click(function(){
						$.ajax({
							type:"get",
							url:"${pageContext.request.contextPath}/front",							
							data:"command=findMemberById&id="+$("#memberId").val(),
							success:function(result){
								alert(result);								
							}
						});//ajax
					});//click
				});//ready
				</script>
				<a href="${pageContext.request.contextPath}/index.jsp">홈</a>
				<hr>
				<form id="findForm" method="get">
					아이디 : <input type="text" id="memberId" name="memberId"
						required="required">
					 <input type="button" value="검색" id="findMemberBtn">
					<span id="resultView"></span>
				</form>
			</div>
		</div>
		<!--  row  -->
	</div>
</body>
</html>











