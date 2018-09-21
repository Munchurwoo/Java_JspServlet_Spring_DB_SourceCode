<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annotation 기반 SpringMVC</title>
</head>
<body>
<H3>고객관리</H3>
<form action="findCustomerById.do">
아이디 <input type="text" name="id" required="required">
<input type="submit" value="고객검색"> 
주소 <input type="text" name="address" requ>
<input type="submit" value="고객검색">
</form>
<!-- 
	views/findbyaddress_customer_ok.jsp
	jstl 로 아이디, 이름, 주소를 제공한다.
	findbyaddress_customer_fail.jsp 
	판교 주소에 사는 회원이 없습니다. alert 후 
	index로 이동시킨다.
 -->
 <br>
 <form metho="post" action="registerCustomer.do">
 	아이디 <input type="text" name="id"><br>
 	이름 <input type="text" name="name"><br>
 	주소 <input type="text" name="address"><br>
 	<input type="submit" value="고객등록">
 </form>
 <%--
 	결과 페이지는 views/register_customer_result.jsp 고객 정보가 등록 되었습니다.
 	조건은 post 방식만 처리되도록 한다. (get 요청시 http 405 error 
 	재동작되지 않도록 redirect 방식으로 응답한다.
  --%>
</body>
</html>