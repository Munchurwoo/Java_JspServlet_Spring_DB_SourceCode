<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Front Controller Pattern</title>
</head>
<body>
<h3>Model2 Architecture(MVC + Front Controller Pattern)</h3>
<%--		Front Controller Design Pattern 은 
		    모든 클라이언트의 다양한 요청을 하나의 진입점으로 
		    처리하기 위한 패턴 
		    웹트래킹(사용자 요청 정보 수집 및 분석, 마케팅 적용) 과
		    보안(인증 및 인가) 등에 일관성있는 정책을 적용할 수 있다 
 --%>
 <%--												FrontController
 			client --총회원수조회요청---> DispatcherServlet 
 													|
 													View 
 													count_view.jsp 
  --%>
 <a href="front3?command=getMemberTotalCount">총회원수조회</a><br><br>
 <%--
 		/front?command=findProductById&productId=a
 		요청시 위와 같이 hidden 의 name 과 value도 함꼐 서버로 전송된다 
  --%>
   <%--												FrontController
 			client -- 상품 검색요청---> DispatcherServlet 
 													|
 													View 
 													findProductById_result.jsp 
  --%>
 <form action="front3">
 <input type="hidden" name="command" value="findProductById">
 상품아이디 <input type="text" name="productId">
 <input type="submit" value="조회">
 </form>
 <br><br>
 <%--										FrontController
 			client--회원가입요청--  DispatcherServlet 
 												|
 												| redirect 
 											View 
 											register_member_result.jsp	
 											
 			hidden name: command value: registerMember  								
  --%>
 <form action="front3" method="post">
 <input type="hidden" name="command" value="registerMember">
 아이디 <input type="text" name="id"><br>
 이름 <input type="text" name="name"><br>
 <input type="submit" value="회원가입">
 </form>
</body>
</html>










