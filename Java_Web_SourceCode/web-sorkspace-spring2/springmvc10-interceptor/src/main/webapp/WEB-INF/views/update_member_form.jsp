<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update_member_form</title>
</head>
<body>
회원정보수정폼 <br><br>
<form method="post" action="updateMember.do">
아이디 <input type="text" name="id" value="${mvo.id}" readonly="readonly"><br>
패스워드 <input type="text" name="password" value="${mvo.password}"><br>
이름 <input type="text" name="name" value="${mvo.name}"><br>
주소 <input type="text" name="address" value="${mvo.address}"><br>
<input type="submit" value="수정하기">	
</form>
<%--		post 방식만 처리되도록 한다 
			수정시 db와 session 인증정보를 모두 수정한다 
			update_member_result.jsp 에서 아이유님 회원정보수정 완료 
			링크로 home(index.jsp) 를 제공한다 
 --%>
</body>
</html>








