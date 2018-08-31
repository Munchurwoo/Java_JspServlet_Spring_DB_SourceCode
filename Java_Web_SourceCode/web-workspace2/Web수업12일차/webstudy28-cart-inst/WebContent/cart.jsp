<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	/*  삭제 버튼을 누르면 confirm() 을 수행해서 상품을 삭제하시겠습니까? 
		확인 누르면 location.href 로 DeleteCartController 로 이동시킨다. 
		이때 command 정보와 no를 함께 전송한다. 
	 */
	function deleteItemFromCart() {
		if (confirm("쇼핑카트에서 상품을 삭제하시겠습니까?")) {		
			document.getElementById("deleteItemForm").submit();
		}
	}
</script>
<div class="row">
<div class="col-sm-4"></div>
<div class="col-sm-6">
<c:choose>
	<c:when test="${!empty sessionScope.memberDTO.cart.itemList}">
		<table class="table table-bordered" >
			<caption>쇼핑카트</caption>
			<c:forEach items="${sessionScope.memberDTO.cart.itemList}" var="item">
				<tr>
					<td>${item.itemNo}</td>
					<td>${item.name}</td>
					<td>${item.maker}</td>
					<td>${item.price}</td>
					<td><form id="deleteItemForm" method="post" action="${pageContext.request.contextPath}/front">
					<input type="hidden" name="command" value="DeleteItemFromCart">
					<input type="hidden" name="no" value="${item.itemNo}">
					<input type="button" value="삭제"  onclick="deleteItemFromCart()">
						</form>
						</td>
				</tr>
			</c:forEach>
			<tfoot>
				<tr>
					<td colspan="5">총액 : ${sessionScope.memberDTO.cart.totalPrice}
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</tfoot>
		</table>
	</c:when>
	<c:otherwise>
			&nbsp;&nbsp;&nbsp;&nbsp;상품 없음^^
	</c:otherwise>
</c:choose>
</div>
<div class="col-sm-2"></div>
</div>