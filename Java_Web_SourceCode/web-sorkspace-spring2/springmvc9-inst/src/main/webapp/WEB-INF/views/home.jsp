<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h3>springmvc9 부서와 사원정보</h3>
총부서수 ${deptCount} 총사원수 ${empCount} 
<%--		개발순서
			sql 확인 
			unitTest 클래스를 추가 ( EmpUnitTest ) 
			EmpDAO 와 EmpDAOImpl 을 생성 
			EmpUnitTest에서 총사원수 조회 단위테스트 
			HomeController 의 home 메서드를 수정 
 --%> 
 <br><br>
 <a href="empHome.do">사원관리</a>
 <%--		 EmpController 추가 
 			 empHome() 를 이용해 
 			 emp_home.jsp 를 제공한다 
  --%>
</body>
</html>










