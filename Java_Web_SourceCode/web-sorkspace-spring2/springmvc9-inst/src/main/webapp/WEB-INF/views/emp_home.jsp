<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원관리</title>
</head>
<body>
<h3>사원관리 홈</h3>
<%--
 		step1
		<select> 를 이용해 option 으로 
		부서명을 제공하고 
		실제 검색시 서버로 전송되는 정보는 
		부서번호가 전송되도록 value를 설정한다 
		step2 
		select option 을 선택하고 검색 버튼을 누르면 
		emp_list.jsp( empno,ename,job )에서 사원정보리스트를 보여준다 
 --%>

 <form action="findEmpListByDeptNo.do">
 <select name="deptNo">
 	<option value="">--부서명--</option>
 	<c:forEach items="${deptList}"  var="dept">
 	<option value="${dept.deptNo}">${dept.dname}</option>
 	</c:forEach>
 </select>
 <input type="submit" value="검색">
 </form>
 <hr>
 <form action="findEmpListLikeName.do">
 사원명 <input type="text" name="ename">
 <input type="submit" value="검색">
 </form>
 <%--		사원명 일부만 입력해도 일부 문자열이 포함된 
 			사원명을 가진 사원정보리스트가 조회 
 			emp_list.jsp 에서 정보를 제공 
  --%>
  <hr>
  <%--
  			부서번호와 사원명으로 조회 
  			
  			수정 내용 
  			1. 검색 조건이 없을 때는 전체 사원을 조회 
  			2. 부서번호(부서명) 선택시에는 부서번호로 사원을 조회 
  			3. 사원명을 입력했을 때에는 사원명으로 조회 
  			4. 부서번호와 사원명을 입력했을 때는 부서번호와 사원명으로
  				조회 
   --%>
   <H4>MyBatis Dynamic SQL Test</H4>
 <form action="findEmpListNameAndDeptNo.do">
 <select name="deptNo">
 	<option value="">--부서명--</option>
 	<c:forEach items="${deptList}"  var="dept">
 	<option value="${dept.deptNo}">${dept.dname}</option>
 	</c:forEach>
 </select>
 사원명 <input type="text" name="ename">
 <input type="submit" value="검색">
 </form>
</body>
</html>





























