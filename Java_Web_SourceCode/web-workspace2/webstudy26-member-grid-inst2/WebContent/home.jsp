<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/myhome.css">
<title>home</title>
</head>
<body>
<div class="container">
	<div class="row header">
		<div class="col-sm-12">
			<c:import url="template/header.jsp"/>
		</div>
	</div>
	<div class="row main">
		<div class="col-sm-8">
			현재 회원수 ${memberTotalCount} 명 
		</div>
		<div class="col-sm-4">
			<c:import url="template/right.jsp"/>
		</div>
	</div>
	<div class="row footer">
		<div class="col-sm-12">
			<c:import url="template/footer.jsp"/>
		</div>
	</div>
</div>
</body>
</html>














