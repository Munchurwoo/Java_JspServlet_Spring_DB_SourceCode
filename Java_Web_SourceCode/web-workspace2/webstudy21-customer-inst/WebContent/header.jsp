<%@page import="org.kosta.model.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h4>
	<a href="front?command=AllCustomerCount">홈로고</a>
	&nbsp;&nbsp;
	<%
		CustomerVO vo = (CustomerVO) session.getAttribute("cvo");
		if (vo == null) {
	%>
	<a href="login.jsp">로그인</a> &nbsp;&nbsp;
	<a href="register.jsp">회원가입</a>
	<%
		} else {
	%>
	     <%=vo.getName() %>님 &nbsp;&nbsp;
	     <a href="front?command=MyPage">마이페이지</a> &nbsp;&nbsp;
	    <a href="front?command=Logout">로그아웃</a> 
	<%
		}
	%>
</h4>
<hr><br>