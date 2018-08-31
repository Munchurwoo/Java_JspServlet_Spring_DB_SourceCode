<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <script type="text/javascript">
	$(document).ready(function(){
		$("#testDiv").on("click","testBtn",function(){
			alert($(this).val());
		})
	})
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
<input type="button" value="버튼생성" id ="crateBtn">
<hr>
<div id="testBtn"></div>
</body>
</html>