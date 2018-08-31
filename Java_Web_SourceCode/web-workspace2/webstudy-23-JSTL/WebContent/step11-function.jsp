<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("아이유", 26));
	list.add(new PersonVO(" 이정빈 ", 31));
	list.add(new PersonVO("박보검", 24));
	request.setAttribute("personlist", list);
	ArrayList<PersonVO> list2 = new ArrayList<PersonVO>();
	request.setAttribute("personlist2", list2);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<%-- request 영역에 있는 personList 의 size 를 출력호고자 한다. --%>
	리스트의 사이즈는 ${fn:length(personlist) }  입니다.  <br>
	리스트 첫번째 요소의 name length 출력 ${fn:length(personlist[0].name) }<br>
	리스트 두번째 요소의 name length 출력 ${fn:length(personlist[1].name) }
	리스트 두번째 요소의 name length 출력하되 <br> 양 공백은 제거한 길이
	<br>${fn:length(fn:trim(personlist[1].name)) }
	

</body>
</html>