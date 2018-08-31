<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="EnterServlet" method="post"">
	이름 : <input type="name" name="name" required="required"><br>
	주소 : <input type="address" name="address"required="required"><br>
	직급 : <input type="text" name ="position"required="required"><br>
	<input type="submit"value="전송">	
	</form>
</body>
</html>