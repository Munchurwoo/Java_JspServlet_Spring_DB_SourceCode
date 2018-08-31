<%@page import="java.util.Iterator"%>
<%@page import="model.PersonVO"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		String fo[] = request.getParameterValues("food");
		for (int i = 0; i < fo.length; i++) {
	%>
	<%=fo[i]%>
	<%
		}
	%>
	<c:forEach items="paramValues.food" var="fo">
		${fo }	<br>
	</c:forEach>
	<%-- el 과 jstl 로 map 을 열거  --%>
	<%
		LinkedHashMap<String, PersonVO> map = new LinkedHashMap<String, PersonVO>();
		PersonVO vo1 = new PersonVO("아이유", 26);
		map.put("A", vo1);
		map.put("B", new PersonVO("박보검", 24));
		request.setAttribute("personMap", map);
	%>
	기존 방식으로 map의 key 와 value를 출력
	<br>
	<%
		LinkedHashMap<String, PersonVO> reMap = (LinkedHashMap<String, PersonVO>) request.getAttribute("personMap");
		Iterator<String> it = reMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
	%>
	key :
	<%=key%><br> value :
	<%=reMap.get(key).getAge()%><br>
	<%
		}
	%>
	JSTL로 map의 key와 value 를 출력
	<br>
	<c:forEach items="$requestScope.personMap" var="p">
		key : ${p.key } value : ${p.value.name } ${p.value.age} 
	</c:forEach>
</body>
</html>