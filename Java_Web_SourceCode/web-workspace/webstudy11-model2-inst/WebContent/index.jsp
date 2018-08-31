<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model2 Architecture</title>
</head>
<body>
 Model2 설계방식의 웹어플리케이션 테스트 <br><br>
 <%--		ControllerServlet으로 검색 정보를 요청하고
 			ControllerServlet은 Model 과 연동 후 
 			연동 결과에 따라 
 			아이디에 해당하는 정보가 존재하면 
 			find_ok.jsp 에서 응답하고 
 			존재하지 않으면 
 			find_fail.jsp에서 응답하게 한다 
  --%>
 <form action="findController">
 아이디 <input type="text" name="id">
 <input type="submit" value="검색">
 </form>
 <hr>
 <form action="registerController" method="post">
 아이디 <input type="text" name="userId"><br>
 이름 <input type="text" name="userName"><br>
 <input type="submit" value="회원가입">
 </form>
</body>
</html>









