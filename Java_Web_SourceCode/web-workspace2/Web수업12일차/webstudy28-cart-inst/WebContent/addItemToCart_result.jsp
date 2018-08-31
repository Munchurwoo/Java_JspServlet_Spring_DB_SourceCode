<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	var flag=confirm("장바구니에 추가! 장바구니로 이동하시겠습니까?");
	if(flag){
		location.href="${pageContext.request.contextPath}/front?command=CartView";
	}else{
		location.href="${pageContext.request.contextPath}/index.jsp";
	}
</script>