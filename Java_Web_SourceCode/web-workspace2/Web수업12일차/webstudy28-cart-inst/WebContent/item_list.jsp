<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table table-bordered  table-hover itemlist">
	<tr>
		<th>번호</th>
		<th>제품명</th>
		<th>제조사</th>
	</tr>
	<c:forEach items="${requestScope.list}" var="item">
		<tr>
			<td><a
				href="front?command=ItemDetail&no=${item.itemNo}">${item.itemNo}</a></td>
			<td><a
				href="front?command=ItemDetail&no=${item.itemNo}">${item.name}</a></td>
			<td>${item.maker}</td>
		</tr>
	</c:forEach>
</table>
