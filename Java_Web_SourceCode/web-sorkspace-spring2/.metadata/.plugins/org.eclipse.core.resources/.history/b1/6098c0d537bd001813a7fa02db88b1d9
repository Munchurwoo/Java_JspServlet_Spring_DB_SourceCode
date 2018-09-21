<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join 연습</title>
</head>
<body>
사원 정보 Home <br><br>
<%--      step1 
			select option 으로 사원번호(empno)를
			제공 
			
			step2 
			select option 을 선택하고 
			검색을 누르면 
			emp_info.jsp 에서 사원 정보를 제공한다 
			사원번호(empno) , 사원명(ename), 직종 (job) , 
			부서번호(deptno), 부서명(dname) , 지역(loc) 을 제공하면 됨 
 --%>

 <form action="findEmpByEmpNo.do">
 	<select name="empNo" required="required">
 		<option value="">--사원번호--</option>
 		<c:forEach items="${empNoList}" var="no">
 			<option value="${no}">${no}</option>
 		</c:forEach>
 	</select>
 	<input type="submit" value="검색">
 </form>
</body>
</html>





















