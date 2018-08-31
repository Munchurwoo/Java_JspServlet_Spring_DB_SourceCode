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
	%>
	<%--
	jstl forEach loop 수행 후 나이 총합 출력 
 --%>
	<c:set var="totalAge" value="0">

	</c:set>
	<c:forEach items="${requestScope.personlist}" var="person">
 	${person.name } ${person.age }
 	<c:set var="totalAge" value="${totalAge+person.age }"></c:set>
		<br>
	</c:forEach>
	나이 총합 : ${totalAge }
	<br>
</body>
<%-- 
	request 영역의 personList 의 요소중 30세 미만의 회원의 이름과 나이를 
	출력하되 순번을 부여한다.
	1 아이유 26
 --%>
<c:set var="rownum" value="0"></c:set>
<c:forEach items="${requestScope.personlist }" var="p" varStatus="info">
	<c:if test="${p.age<30}">
		<c:set var="rownum" value="${rownum+1 }">
		</c:set>
 	${rownum }. ${info.count } ${p.name } ${p.age } <br>
	</c:if>
</c:forEach>
<hr>
<%
	PersonVO pvo = new PersonVO("이동규",28);
	session.setAttribute("personVO", pvo);
	// ex) session 안에 ListVO 안에 PagingBean 안에 nowPage 에 접근해야 한다.
%>
${sessionScope.personVO.name}
${sessionScope.personVO.age }
<%-- 반복작업 줄이기 위해 아래와 같이 c:set을 이용하면 된다. --%>
<c:set var="p"value="${sessionScope.personVO }"></c:set>
${p.name } ${p.age }
</html>