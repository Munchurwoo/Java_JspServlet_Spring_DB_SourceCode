<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h3>Model2 회원관리</h3>
<%--					 Controller 														Model
          index.jsp --  DispatcherServlet  - HandlerMapping - Controller  - 	MemberDAO
																							MemberVO
				
																	FindMemberByIdController	
				View : findbyid_ok.jsp , findbyid_fail.jsp 																			 
 --%>
<form action="front">
<input type="hidden" name="command" value="findMemberById">
아이디 <input type="text" name="memberId">
<input type="submit" value="검색">
</form>
<br><br>
<a href="findbyaddress_form.jsp">주소로 회원검색</a>
<br><br>
<%--
			비로그인 상태이면 로그인 링크와 회원가입 링크를 제공한다 
			로그인 상태이면 아이유님 로그인 상태 메세지와 로그아웃링크 , 카페가기 
			회원정보수정링크를
			제공한다 
 --%>
 <%--												DispatcherServlet - HandlerMapping - Controller			 MemberDAO
  		login_form.jsp  --  id와 password ---  								   LoginController    ------   login(id,password) : MemberVO 
 											
 											 view : login_fail.jsp  로그인실패 alert 후 index.jsp 로 이동 
 											 		 login_ok.jsp  아이유님 로그인 완료   카페가기 링크 
  --%>
  <%
  		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
  		if(mvo==null){
  %>
 <a href="login_form.jsp">로그인</a><br>
 <a href="register_form.jsp">회원가입</a><br>
 <%	}else{ %>
 <%=mvo.getName() %>님 로그인 상태 <br>
 <a href="front?command=logout">로그아웃</a><br>
 <a href="cafe.jsp">카페가기</a><br>
 <a href="update.jsp">회원정보수정</a>
 <%} %>
</body>
</html>

























