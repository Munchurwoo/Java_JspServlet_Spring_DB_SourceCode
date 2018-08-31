<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	alert("사용 가능한 아이디 입니다.");
	function closeWindow(){
		//alert("close");
		// 현재 판업창을 띄운 본화면의 제어해 본다.
		// 자신을 띄운 본화면(opener)의 요소중 userId의 value에 값을 할당 )
		opener.document.testForm.userId.value="<%=request.getAttribute("id")%>"
		opener.docment.userInfo.id.focus();	
		opener.docment.userInfo.flag.value="<%=request.getAttribute("id")%>";	
		//자시 자신을 가르키는 자바스크립트 키워드 
		//현재 창이 종료된다.
		self.close();
	}
</script>
</head>
<body onunload="closeWindow()">
		<input type="button" value ="확인" onclick="closeWindow()">
	
</body>
</html>