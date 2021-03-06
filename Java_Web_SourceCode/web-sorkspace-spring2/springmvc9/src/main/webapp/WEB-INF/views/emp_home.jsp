<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사원관리 홈

	<%--
	<select 를 이용해 option 으로 부서명을 제공하고 
	실제 검색시 서버로 전송되는 정보는 부서번호가 전송되도록 value 를 설정한다.
	
	select option을 선택하고 검색 버튼을 누르면  
	emp_list.jsp(empno, ename, job)에서 사원정보를 보여준다.
	
 --%>
	<form action="findEmpListByDeptNo.do">
		<select name="deptNo">
		<c:forEach items="${deptNo}" var="deptNo">
			<option value="${deptNo.deptNo}">${deptNo.dname }</option>
		</c:forEach>
		</select>
		<input type="submit" value="검색">
	</form>
	
	<form action="findEmpListLikeName.do">
	사원명 <input type="text" name="ename">
	<input type="submit" value="검색">
	</form>
	<%--
		사원명 일부만 입력해도 일부문자열이 포함된 사원명을 가진 사원정보 리스트가 조회 
		emp_list.jsp 에서 정보를 제공
	 --%>
	 
	 <%--
	 	부서와 사원명 조회  수정내용 
	 	1. 검색 조건이 없을 때는 전체 사원을 조회 
	 	2. 부서번호(부서명) 선택시에는 부서번호로 사원을 조회 
	 	3. 사원명을 입력했을 때는 사원명으로 조회 
	 	4. 부서번호와 사원명을 입력했을 때는 부서번호와 사원명으로 조회 
	 	mybatis dynamic sql test
	  --%>
	 <form action="findEmpListNameAndDeptNo.do">
		<select name="deptNo">
		<c:forEach items="${deptNo}" var="deptNo">
			<option value="${deptNo.deptNo}">${deptNo.dname }</option>
		</c:forEach>
		</select>
			사원명 <input type="text" name="ename">
		<input type="submit" value="검색">
	</form>

	 
</body>
</html>