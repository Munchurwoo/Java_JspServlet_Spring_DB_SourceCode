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
<title>step4-mouseenter.jsp</title>
<style type="text/css">
#friendImg {
	display: none;
}

span {
	background-color: yellow;
	font-size: 25px;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		/* $("#infoSpan").mouseenter(function() {
			$("#friendImg").show()
		});
		$("#infoSpan").mouseleave(function() {
			$("#friendImg").hide();
		}); */
		// 위 두 기능을 hover 함수를 이용해서 처리해본다. 
		$("#infoSpan").hover(function() {
			$("#friendImg").show();
		},function() {
			$("#friendImg").hide();
		});
	});
			
</script>
</head>
<body>
	<%--	infoSpan 영역에 마우스가 진입되면 friendImg가 보이게 한다 
		mouseenter(function(){}) 				 show() 
		infoSpan 영역에서 마우스가 나가면 friendImg가 안보이게 한다
		mouseleave(function(){})					 hide()  
 --%>
	<div class="container">
		<span id="infoSpan">마우스를 올려보세요</span><br> <br> <img
			src="아이유.jpg" class="img-circle" id="friendImg" width="304"
			height="236">
	</div>
</body>
</html>







