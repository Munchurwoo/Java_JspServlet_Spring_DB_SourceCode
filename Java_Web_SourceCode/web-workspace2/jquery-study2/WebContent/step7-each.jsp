<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>step5-checkbox</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#menuForm").submit(function(){
			var ch = $("#menuForm :checkbox[name=menu]:checked");
			if(ch.length==0){
				alert("메뉴를 선택하세요");
				return false;
			}else{
				var info="";
				ch.each(function (index) {
					//alert(index+"."+$(this).val());
					info +=index+"."+$(this).val();
				}).fadeOut(1000);
				/* for(var i =0; i<ch.length;i++){
					info+=$(ch[i]).val()+" ";
				} */
			}
			return confirm(info+" 주문 하시겠습니까?");
		});
	});
</script>
</head>
<body>
<form action="test.jsp" id="menuForm">
<input type="checkbox" name="menu" value="새우">새우<br>
<input type="checkbox" name="menu" value="삼겹살">삼겹살 <br>
<input type="checkbox" name="menu" value="김치찌개">김치찌개<br>
<input type="submit" value="주문">
</form> 
</body>
</html>