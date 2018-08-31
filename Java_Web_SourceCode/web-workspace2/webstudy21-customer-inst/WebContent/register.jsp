<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
<script type="text/javascript">
function checkForm(){
	var f=document.registerForm;	
	if(f.password.value!=f.repeatPassword.value){
		alert("패스워드와 패스워드 확인이 일치하지 않습니다");
		return false;
	}
	if(f.flag.value!=f.id.value){
		alert("인증받은 아이디가 아닙니다\n아이디 중복확인을 하세요");
		return false;		                                           
	}	
}
	function checkId() {
		var str = document.registerForm.id.value;
		if (str == "") {
			alert("아이디를 입력하세요!");
		} else {
			window.open("front?command=IdCheck&id=" + str, "popup",
					"width=200,height=200,top=150,left=400");
		}
	}
</script>
</head>
<body>
<div class="container">
<jsp:include page="header.jsp"/>
<h3>회원가입</h3>
		<form method="post" name="registerForm" action="front"
		onsubmit="return checkForm()">
		<input type="hidden" name="command" value="Register">
		아이디 : <input type="text" name="id" required="required">	
		<input type="button" value="중복확인" onclick="checkId()">		
		<br>패스워드 : <input type="password" name="password" required="required">		
		<br>패스워드 확인 : <input type="password" name="repeatPassword" required="required">		
		<br>이름 : <input type="text" name="name" required="required">	
		<br>주소 : <input type="text" name="address" required="required">
		<input type="hidden" name="flag"  value="">		
		<br>생일 : <input type="date" name="birthday" required="required" >
		<br><input type="submit" value="회원가입">
		</form>
</div>		
</body>
</html>







