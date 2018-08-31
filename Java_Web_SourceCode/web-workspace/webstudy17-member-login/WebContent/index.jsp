<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Model2 회원관리</h3>
<%-- 					controller
		index.jsp ---- DispatcherServlet -- HandllerMapping -- Controller ----- Model
															FindMemberById		MemberDAO
																				MemberVO
			view : findbyid_ok.jsp , findbyid_fail.jsp
 --%>
<form action="front">
	<input type="hidden" name="command" value="findMemberById">
	아이디<input type="text" name="memberId">
	<input type="submit" value="검색">
</form>
<br><br>
<a href="findbyaddress_form.jsp">주소로 회원검색</a> 
<br><br>
<%-- 
	비로그인 상태이면 로그인 링크와 회원가입 링크를 제공한다.
	로그인 상태이면 아이유님 상태 메세지와 로그아웃 링크 , 카페가기, 회원정보 수정링크를 제공한다.
 --%>
 <%
 	MemberVO mvo = (MemberVO) session.getAttribute("vo");
 	if(mvo==null){
 	%>
 <a href="login_form.jsp">로그인</a><br>
 <a href="register_form.jsp">회원가입</a><br>
<% }else{ %> 
 님 로그인 상태 <br>
 <a href ="로그아웃"></a><br>
 <a href="cafe.jsp">카페가기 </a><br>
 <a href="">회원수정</a>
 	<%} %>
 	
</body>
</html>