<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>step6-checkbox</title>
<script type="text/javascript">
	/* $(document).ready(function(){
		$("#menuForm").submit(function(){
			var ch = $("#menuForm :checkbox[name=menu]:ckecked");
			if(ch.length==0){
				alert("메뉴를 선택하세요");
				return false;
			}else{
				var info="";
				for(var i =0; i<ch.length;i++){
					info+=$(ch[i]).val()+" ";
				}
			}
			return confirm(info+" 주문 하시겠습니까?");
		});
	}); */
	$(document).ready(function (){
		$("#menuForm").submit(function (){
			var ch = $("#menuForm :checkbox[name=menu]:checked");
			if(ch.length==0){
				alert("메뉴를 선택하세요.");
			}else{
				var info = "";
				for(var i =0; i<ch.length;i++){
					info = info+$(ch[i]).val()+ " ";
				}
				return confirm(info + " 을 주문하시겠습니까?");
			}
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
<!--  submit 버튼 누르면 
  menu 체크박스에 선택된 정보가 없으면 
  메뉴를 선택하세요 alert 후 전송시키지 않는다 
  선택 정보가 있으면 
  삼겹살 김치찌개 주문 이라는 선택정보를 
  alert 으로 표현한 후 confirm 으로 
  삼겹살 김치찌개 주문하시겠습니까  확인 누르면 전송 
  취소누르면 전송하지 않는다 
 -->
 
</body>
</html>