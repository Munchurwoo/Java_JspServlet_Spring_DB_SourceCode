<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var="customer">
고객아이디 : ${customer.id}<br>
고객명 : ${customer.name}<br>
주소 : ${customer.address}<br>
</c:forEach>
</body>
</html>