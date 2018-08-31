<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#allCheck").change(function(){
			var flag = $(this).prop("checked");
			$("#menuForm :checkbox[name=menu]").prop("checked",flag);
		});
	});
</script>
</head>
<body>
<form action="test.jsp" id="menuForm">
<input type="checkbox" id="allCheck" >전체선택<br>
<input type="checkbox" name="menu" value="새우">새우<br>
<input type="checkbox" name="menu" value="삼겹살">삼겹살 <br>
<input type="checkbox" name="menu" value="김치찌개">김치찌개<br>
</form> 
</body>
</html>








