<%@page import="org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID"%>
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
		String names[] = { "이동규", "장소정", "이정빈", "이성렬", "최요셉" };
		request.setAttribute("nameArray", names);
	%>
	<%-- jstl forEach --%>
	<c:forEach items="${nameArray }" var="name" varStatus="info">
	index : ${info.index} count : ${info.count } ${name } <br>
	</c:forEach>
	<%
		ArrayList<PersonVO> list = new ArrayList<PersonVO>();
		list.add(new PersonVO("이동규", 28));
		list.add(new PersonVO("장소정", 24));
		list.add(new PersonVO("이정빈", 22));
		request.setAttribute("personList", list);
	%>
	<%-- age가 25세 미만인 사람들만 출력하도록 변경  --%>

	<c:forEach items="${personList}" var="list" varStatus="info">
		<%-- ${info.count} ${list.get(${info.index}).getName }  ${list.get(${info.index}).getAge } --%>
		<c:if test="${list.age<25 }">
		${info.count } 이름 :${list.name } 나이 :${list.age } <br>
		</c:if>
	</c:forEach>
	<form action="step6-forEach-action.jsp">
		<input type="checkbox" name="food" value="족발">족발<br>
		<input type="checkbox" name="food" value="곱창">곱창<br>
		<input type="checkbox" name="food" value="닭발">닭발<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>