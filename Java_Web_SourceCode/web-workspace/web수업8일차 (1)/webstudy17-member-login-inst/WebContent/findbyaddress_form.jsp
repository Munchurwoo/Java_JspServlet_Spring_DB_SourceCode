<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색폼</title>
</head>
<body>
<form action="front">
<input type="hidden" name="command" value="findMemberListByAddress">
주소 <input type="text" name="address">
<input type="submit" value="회원검색">
</form>
<%--			DispatcherServlet - HandlerMapping - Controller ---- MemberDAO 
		 																				findMemberListByAddress(address) : ArrayList<MemberVO>
		 													FindMemberListByAddressController				
 				View :  findbyaddress_ok.jsp 명단을 테이블로 제공 (아이디 이름)
 						 판교에 사는 회원 명단 
 						 테이블... 
 						 findbyaddress_fail.jsp
 						 alert() 으로 종로에 사는 회원이 존재하지 않습니다
 						 index.jsp로 이동시킨다  
 --%>
</body>
</html>









