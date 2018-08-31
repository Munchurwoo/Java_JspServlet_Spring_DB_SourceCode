<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색폼</title>
</head>
<body>
<%--		Model 1 설계방식으로 개발 
			1. MemberDAO 에서 회원검색 메서드 구현 후 테스트 
			   findMemberById(id:String) : MemberVO 
			2. findbyid_action.jsp 에서 
			   MemberDAO 의 findMemberById() 를 이용해 
			   클라이언트에 응답한다 	
 --%>
<form method="get" action="findbyid_action.jsp">
아이디 <input type="text" name="memberId" required="required">
<input type="submit" value="회원검색">
</form>
<%--
		 아이디에 해당하는 회원이 있으면 
		 아이디 : java 
		 이름 : 김태리 
		 주소 : 판교 
		 
		 없으면 
		 자바스크립트로  alert 으로 
		 회원이 존재하지 않습니다! 
		 확인 누르면 
		 home.html 로 이동시킨다. 
 --%>
</body>
</html>


















