<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 활용</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest();//ajax를 위한 javascript 객체 
		xhr.onreadystatechange=callback;//콜백함수등록 
		var userId=document.getElementById("id");
		//alert(userId.value);
		xhr.open("get", "FindMemberAjaxServlet?id="+userId.value);
		xhr.send(null);
	}
	function callback(){ //서버가 응답하면 동작되는 함수 
		if(xhr.readyState==4&&xhr.status==200){
			//alert(xhr.responseText);
			// 서버가 응답한 검색 결과를 span id result 영역에 출력한다
			document.getElementById("result").innerHTML=xhr.responseText;
			document.getElementById("id").value="";
		}
	}
</script>
</head>
<body>
<h3>회원 검색을 기존 방식과 ajax 방식으로 구현해 비교</h3>
<br><br>
<form action="FindMemberServlet">
id  <input type="text" name="id"> 
<input type="submit" value="기존 방식 검색">
</form>
<br><br>
id <input type="text" name="id" id="id">
<input type="button" value="ajax방식검색" onclick="startAjax()">
<span id="result"></span> 
<span id="nameView"></span><br><br>
<span id="addressView"></span>
</body>
</html>
















