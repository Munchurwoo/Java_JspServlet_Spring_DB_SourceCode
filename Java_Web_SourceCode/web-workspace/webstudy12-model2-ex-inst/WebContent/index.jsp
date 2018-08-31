<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mode2 연습</title>
</head>
<body>
<%--		Controller ( controller.MemberCountServlet ) 
											Model ( MemberDAO,MemberVO ) <--> DB
			View ( member_count.jsp ) 
 --%>
<a href="MemberCountServlet">전체 회원수 보기</a>
<hr>
<form method="get" action="FindMemberByIdServlet">
아이디 <input type="text" name="memberId">
<input type="submit" value="검색">
</form>
<%--			Controller: FindMemberByIdServlet  <--> Model : MemberDAO 
				|
				View
				findbyid_ok.jsp   or  findbyid_fail.jsp 
				(검색결과)			( alert으로 검색결과없음 후 index.jsp로 이동)
 --%>
 <hr>
 <form action="FindMemberListByAddressServlet">
 주소 <input type="text" name="address" required="required">
 <input type="submit" value="검색">
 </form>
 <%--					Controller(FindMemberListByAddressServlet) <-> Model(MemberDAO)
 		index.jsp			|
						 View( findbyaddress_ok.jsp or findbyaddress_fail.jsp ) 	
						        목록을					alert() 종로 주소에 사는 없음 후 이동 
						        
						       판교에 사는 회원명단  
						       1. java 	아이유 			
						       2. spring   문준위 
  --%>
</body>
</html>















