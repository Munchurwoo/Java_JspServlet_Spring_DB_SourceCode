<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/css.css">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkValue(){
		if(!document.userInfo.id.value){
			alert("아이디를 입려하세요.");
		}
		if(!document.userInfo.password.value){
			alert("비밀번호를 입력하세요.")
		}
		if(document.userInfo.password.value!=document.userInfo.passwordch.value){
			alert("비밀번호가와 비밀번호 확인이 잘못 됬습니다.")
			return false;
		}
	}if(document.userInfo.id.value!=document.userInfo.flag.value){
		alert("인증받은 아이디가 아닙니다. \n 중복 확인하세요.")
	}
	function checkId(){
		open("front?command=idCheck&id="+document.userInfo.id.value,"mypopup","width=150,height=150,top=150,left=200");
	}
</script>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<hr>
	<form action="front" method="post" name="userInfo" onsubmit="return checkValue()">
	<input type="hidden" name="command" value="register">
	<input type="hidden" name="flag" value	="">
	아이디 : <input type="text" name="id" required="required"><input type="button" value="중복확인" onclick="checkId()"><br>
	패스워드 : <input type="text" name="password" required="required"><br>
	패스워드 확인 : <input type="text" name="passwordch" required="required"><br>
	이름 : <input type="text" name="name" required="required"><br>
	주소 : <input type="text" name="address" required="required"><br>
	생일 : <input type="date" name=birthday required="required"><br>
	<input type="submit" value="회원가입">
	</form>
</body>
</html>