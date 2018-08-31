<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>step7-prop.jsp</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#checkBtn1").click(function() {
			//mailing 체크박스의 ㅅ체크 상태를 변화시킨다. 
			$("#mailing").prop("checked", true);
		})
		$("#checkBtn2").click(function() {
			//mailing 체크박스의 ㅅ체크 상태를 변화시킨다. 
			$("#mailing").prop("checked", false);
		})
		$("#checkBtn3").click(function() {
			//mailing 체크박스의 ㅅ체크 상태를 변화시킨다. 
			alert($("#mailing").prop("checked"));
		})
	})
</script>
</head>
<body>
	<input type="checkbox" id="mailing">메일체크
	<br>
	<input type="button" id="checkBtn1" value="체크하기">
	<input type="button" id="checkBtn2" value="체크해제하기">
	<input type="button" id="checkBtn3" value="체크상태확인">
</body>
</html>









