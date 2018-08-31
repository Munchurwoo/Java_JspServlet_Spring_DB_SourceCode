<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기 방식(ajax)</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest();// ajax 통신을 위한 자바스트립트 객체 
		alert(xhr);
		//call back 함수를 등록
		//callback 함수란 서버가 응답하면 동작될 함수를 의미 
		xhr.onreadystatechange=callback; 
		xhr.open("get","ASynServlet");// request 요청방식과 서버 url을 명시 
		xhr.send(null);//post방식일때 정보 전송용으로 사용 
	}
	// 서버가 회신(응답)하면 실행되는 함수 
	function callback(){
		//readyState 가 4 이면 응답데이터를 받은 상태 
		//status 가 200이면 정상 수행 
		if(xhr.readyState==4&&xhr.status==200){
			//alert(xhr.responseText);//서버가 응답한 정보를 확인 
			document.getElementById("result").innerHTML=xhr.responseText;
		}
	}
</script>
</head>
<body>
<input type="text" name="userInfo">
<input type="button" value="비동기적 방식(ajax)" onclick="startAjax()">
<span id="result"></span>
<br><br><br>
<hr>
<textarea rows="100" cols="100"></textarea>
</body>
</html>











