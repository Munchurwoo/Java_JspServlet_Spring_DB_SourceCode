<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>회원가입폼</title>
<script type="text/javascript">
	$(document).ready(function(){
		var checkFlag="";
		$("#memberId").keyup(function(){	
			$.ajax({
				type:"get",
				url:"checkId.do",
				data:"id="+$("#memberId").val(),
				success:function(result){
					if(result=="ok"){
						$("#checkIdView").html("사용가능").css("color","blue");
						checkFlag=$("#memberId").val();
					}else{
						$("#checkIdView").html("사용불가").css("color","red");
						checkFlag="";
					}
				}
			});//ajax
		});//keyup
		$("#registerForm").submit(function() {		
			if(checkFlag==""){
				alert("아이디 중복확인이 필요합니다");
				return false;
			}
		});
	});//ready
</script>
</head>
<body>
<form method="post" action="registerMember.do" id="registerForm">
아이디 <input type="text" name="id" id="memberId" required="required">
<span id="checkIdView"></span><br>
패스워드 <input type="password" name="password" required="required"><br>
이름 <input type="text" name="name" required="required"><br>
주소 <input type="text" name="address" required="required"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>














