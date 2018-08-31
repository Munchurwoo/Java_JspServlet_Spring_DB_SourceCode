<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file upload</title>
</head>
<body>  
<%-- WEB-INF/info/ 아래에 db sql 과 환경설정에 대한 정보를 확인하세요! --%>
	<h3>파일업로드 테스트</h3>
	<!-- 파일업로드 전송폼에 method는 post로 하고 enctype을 반드시 multipart로 명시해야 함!!!!! -->
	<form method="post" action="DispatcherServlet" enctype="multipart/form-data">
		<input type="hidden" name="command" value="RegisterProduct">
		상품명 <input type="text" name="name"><br>
		제조사 <input type="text" name="maker"><br>
		사진  <input type="file" name="picture" > <br>
		<input type="submit" value="전송" >
	</form>
	<hr><br><br>
	<%-- 일반 전송폼  --%>
	<form method="post" action="DispatcherServlet">
		<input type="hidden" name="command" value="RegisterProduct">
		상품명 <input type="text" name="name"><br>
		제조사 <input type="text" name="maker"><br>
		<input type="submit" value="전송" >
	</form>
</body>
</html>