<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
<%
		ArrayList<PersonVO> list = new ArrayList<PersonVO>();
		list.add(new PersonVO("아이유", 26));
		list.add(new PersonVO("이정빈", 31));
		list.add(new PersonVO("박보검", 24));
		request.setAttribute("personlist", list);
		ArrayList<PersonVO> list2 = new ArrayList<PersonVO>();
		request.setAttribute("personlist2", list2);	%>
		<%-- 리스트가 비어있거나 null 이면 --%>
		<c:if test="${empty requestScope.personlist2 }">
			리스트에 사람이 없어요
		</c:if>
		<c:if test="${!empty requestScope.personlist }">
			리스트에 사람이 있어요
		</c:if>
</body>
</html>