<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
		MemberController MemberDAO 와 Impl member.xml(mapper) 
				|
			로그인 실패			login_fail.jsp에서 alert 후 home으로 
			로그인 성공			인증정보를 MemberVO 객체 session 에 mvo name 으로 할당 
			SESSION에 mvo name으로 할당하고 
			home으로 이동, 
			로그인폼 대신 아이유님 로그인 로그아웃버튼 post 방식만 허용 
	 --%>
	<c:choose>
		<c:when test="${sessionScope.mvo==null}">
			<form method="post" action="user-login.do">
				아이디 <input type="text" name="id"><br> 패스워드 <input
					type="password" name="password"><br> <input
					type="submit" value="로그인">
			</form>
			<br>
			<a href="registerMemberForm.do">회원가입</a>
			<%--		step1 회원가입처리 ( post 방식 ) 
  						   jsp : register_member_form.jsp 
  					step2 아이디 중복확인 ( jquery ajax keyup 이용해서 ) 
  		 --%>
		</c:when>
		<c:otherwise>
			${mvo.id } 님 로그인을 환영합니다.<br>
			<a href="home.do">홈으로 가기 </a><br>
			<a href="logout.do">로그아웃</a><br>
			<br>
			<a href="updateMemberForm.do">회원정보수정하기</a>
		</c:otherwise>
	</c:choose>
	<%--
		검색 결과 있으면 find_member_ok.jsp
		없으면 find_member_fail.jsp
		%% 비로그인 상태에서 가능 %%
	 --%>
	<form action="user-findMemberById.do">
	아이디 <input type="text" name="id">
	<input type="submit" value="검색">
	</form>
	
	<%--로그인 상태에서 서비스 가능 --%>
	<a href="cafe.do">카페</a>
	<a href="mypage.do">마이페이지</a>
	
<%-- 	<img src="${pageContext.request.contextPath }/resources/interceptorjpg.jpg">
 --%></body>
</html>