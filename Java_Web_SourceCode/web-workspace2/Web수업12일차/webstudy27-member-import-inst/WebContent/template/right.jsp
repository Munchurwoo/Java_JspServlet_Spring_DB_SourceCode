<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- right.jsp 
	경로  jsp:include , jsp:forward , jstl c:import    / 만 명시하면 
			web application 명 아래에서 찾는다 
			
			html ,javascript , css  와 같이 클라이언트에서 해석되는 코드는
			${pageContext.request.contextPath}/  명시하면 
			web application 명 아래에서 찾는다 
 --%>
 <c:choose>
 	<c:when test="${sessionScope.mvo==null}">
 	<form action="${pageContext.request.contextPath}/front">
	<input type="hidden" name="command" value="login">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" required="required"></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="password" required="required"></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="submit" value="로그인">
			</td>
		</tr>
	</table>
</form>
 	</c:when>
 	<c:otherwise>
 	${sessionScope.mvo.name}님<br>
 	<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a><br>
 	<%-- <a href="${pageContext.request.contextPath}/member/cafe.jsp">카페가기</a> --%>	
 	<%--   --%>
 	<a href="${pageContext.request.contextPath}/front?command=cafeHome">카페가기</a>
 	</c:otherwise>
 </c:choose>

<br><br>
<%-- <a href="${pageContext.request.contextPath}/member/findbyid_form.jsp">아이디로 회원검색</a> --%>
<%--	layout.jsp를 이용하기 위해 모든 요청은 front에서 처리해야 한다 
		DispatcherServlet - HandlerMapping - FindMemberByIdFormController
														|
													view : template/layout.jsp 	
 --%>
<a href="${pageContext.request.contextPath}/front?command=findMemberByIdForm">아이디로 회원검색</a>





















