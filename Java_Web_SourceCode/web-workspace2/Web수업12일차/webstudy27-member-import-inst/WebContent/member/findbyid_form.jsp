<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="${pageContext.request.contextPath}/front">
	<input type="hidden" name="command" value="findMemberById"> 
	아이디 <input type="text" name="id"> 
	<input type="submit" value="검색">
</form>