<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function checkForm(){
		// form 요소를 name으로 접근
		//document.폼이름.요소이름.value
		var pv=document.registerForm.password.value;
		var rv=document.registerForm.repeatPassword.value;
		if(pv!=rv){
			alert("비밀번호와 확인란이 일치하지 않습니다");
			return false;// false 를 반환하면 전송되지 않는다
		}
		if(document.registerForm.id.value!=document.registerForm.flag.value){
			alert("인증받은 아이디가 아닙니다! \n아이디 중복확인하세요!");
			return false;
		}
	}//checkForm
	function checkId(){
		var sendId=document.registerForm.id;
		if(sendId.value==""){
			alert("아이디를 입력하세요");
			sendId.focus();
		}else{//새창을 띄운다 
			open("front?command=idcheck&id="+sendId.value,"mypopup","width=200,height=150,top=150,left=200");
		}
	}
</script>
</head>
<body>
<a href="index.jsp">Home</a><hr>
<form action="front" method="post" name="registerForm" onsubmit="return checkForm()">
<input type="hidden" name="command" value="registerMember">
<input type="hidden" name="flag" value="">
아이디 : <input type="text" name="id" required="required">
<input type="button" value="중복확인" onclick="checkId()">
<br>
패스워드 : <input type="password" name="password" required="required"><br>
패스워드확인 : <input type="password" name="repeatPassword" required="required"><br>
이름 : <input type="text" name="name" required="required"><br>
주소 : <input type="text" name="address" required="required"><br>
<input type="submit" value="회원가입">
</form>
<%--	1. 회원가입처리 : db에 신규회원정보를 저장한다 
		2. 비밀번호와 비밀번호 확인란에 정보가 일치하지 않으면 
			alert으로 메세지를 보여주고 전송시키지  않는다 
			--> javascript 를 이용해야 한다 
		-----------------------------------------
		-----------------------------------------	 
		3. 아이디 중복확인을 javascript popup을 이용해 처리한다 
		    ( 카페 실행 화면을 참고한다 ) 
 --%>
</body>
</html>










