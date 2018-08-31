<%@page import="org.kosta.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<a href="index.jsp">홈로고</a>
&nbsp;&nbsp;
<%
		MemberDTO mvo=(MemberDTO)session.getAttribute("mvo");
		if(mvo!=null){
%>
<%=mvo.getId() %>님 로그인 완료 <%} %>
<a href="my_page.jsp">마이페이지</a>
&nbsp;&nbsp;
<a href="logout.jsp">로그아웃</a>
&nbsp;&nbsp;
<hr>