<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	function addItemToCart() {
		if (confirm("쇼핑카트에 담으시겠습니까?")) {
			document.getElementById("itemForm").submit();
		}
	}
</script>
<div class="row">
<div class="col-sm-3"></div>
<div class="col-sm-6">
<table class="table table-bordered">
	<tr>
		<td>NO</td>
		<td>${requestScope.itemDTO.itemNo}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>${requestScope.itemDTO.name}</td>
	</tr>
	<tr>
		<td>Maker</td>
		<td>${requestScope.itemDTO.maker}</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${requestScope.itemDTO.price}</td>
	</tr>
	<tr>
		<td>Detail</td>
		<td><pre>${requestScope.itemDTO.detail}</pre></td>
	</tr>
	<c:if test="${sessionScope.memberDTO!=null}">
		<tr>
			<td colspan="2" align="center">
				<form id="itemForm" method="post" action="front">
					<input type="hidden" name="command" value="AddItemToCart"> <input
						type="hidden" name="no" value="${requestScope.itemDTO.itemNo}">
					<input type="button" onclick="addItemToCart()" value="장바구니에 담기">
				</form>
			</td>
		</tr>
	</c:if>
</table>
</div>
<div class="col-sm-3"></div>
</div>