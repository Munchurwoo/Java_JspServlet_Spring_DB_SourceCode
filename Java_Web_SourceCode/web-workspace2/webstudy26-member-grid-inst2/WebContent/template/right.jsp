<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- right.jsp  --%>
<c:choose>
	<c:when test="${sessionScope.mvo==null }">
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
					<td colspan="2" align="right"><input type="submit" value="로그인">
					</td>
				</tr>
			</table>
		</form>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name } 님 로그인을 축하합니다. <br>
		<a href="${pageContext.request.contextPath}/member/cafe.jsp">카페가기</a><br>
		<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a><br>
	</c:otherwise>
</c:choose>

<br>
<br>
<a href="${pageContext.request.contextPath}/member/findbyid_form.jsp">아이디로
	회원검색</a>















