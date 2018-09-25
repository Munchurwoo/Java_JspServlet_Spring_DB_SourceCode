<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
  <script src="//code.jquery.com/jquery.min.js"></script> 
    <script type="text/javascript">
    $(document).ready(function(){
    	$("#logout").click(function(){
    		if(confirm("로그아웃하시겠습니까?")){
    			location.href="${pageContext.request.contextPath}/logout.do";
    		}
    	});
    });	
</script>
<p>
&nbsp;&nbsp;
<c:choose>
<c:when test="${sessionScope.mvo==null}">
<form method="post" action="${pageContext.request.contextPath}/login.do">
아이디  <input type="text" name="id" size="7" >
비밀번호  <input type="password" name="password" size="7">
<input type="submit" value="로그인">
</form>
</c:when>
<c:otherwise>
<a href="${pageContext.request.contextPath}/list.do">홈</a>
<a href="${pageContext.request.contextPath}/writeForm.do">| 글쓰기</a> 
| ${sessionScope.mvo.name}님 | <a href="#" id="logout">로그아웃</a>
</c:otherwise>
</c:choose>
</p>