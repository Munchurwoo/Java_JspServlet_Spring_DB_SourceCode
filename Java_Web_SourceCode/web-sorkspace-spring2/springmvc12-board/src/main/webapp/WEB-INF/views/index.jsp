<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css">
</head>
<body>
	
	    <script type="text/javascript">
	function logout(){
		var f=confirm("로그아웃하시겠습니까?");
		if(f)
			location.href="logout.do";
	}
</script>
<c:choose>
<c:when test="${sessionScope.mvo==null}">
			<form method="post" action="user-login.do">
				아이디 <input type="text" name="id"> 패스워드 <input
					type="password" name="password"> <input
					type="submit" value="로그인">
			<a href="#">회원가입</a>
			</form>
			<%--		step1 회원가입처리 ( post 방식 ) 
  						   jsp : register_member_form.jsp 
  					step2 아이디 중복확인 ( jquery ajax keyup 이용해서 ) 
  		 --%>
		</c:when>
<c:otherwise>
<a href="home.do">홈</a>&nbsp;&nbsp;
<a href="">글쓰기</a>&nbsp;&nbsp; 
 ${sessionScope.mvo.name}님 &nbsp;&nbsp; 
 <a href="javascript:logout()">로그아웃</a>
</c:otherwise>
</c:choose>

<table class="table table-bordered  table-hover boardlist">
	<thead>
		<tr class="success">
			<th>번호</th>
			<th class="title">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="pvo" items="${requestScope.lvo.list}">
			<tr>
				<td>${pvo.no }</td>
				<td><c:choose>
						<c:when test="${sessionScope.mvo!=null}">
							<a
								href="${pageContext.request.contextPath}/front?command=PostDetail&no=${pvo.no }">
								${pvo.title }</a>
						</c:when>
						<c:otherwise>
				${pvo.title }
				</c:otherwise>
					</c:choose></td>
				<td>${pvo.memberVO.name }a</td>
				<td>${pvo.timePosted }b</td>
				<td>${pvo.hits }c</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%-- paging 처리 --%>
<%-- 코드를 줄이기 위해 pb 변수에 pagingBean을 담는다. --%>
<c:set var="pb" value="${requestScope.lvo.pagingBean}"></c:set>
<div class="pagingArea">
	<ul class="pagination">
		<c:if test="${pb.previousPageGroup}">
			<li><a
				href="front?command=List&pageNo=${pb.startPageOfPageGroup-1}">&laquo;</a>
			</li>
		</c:if>
		<c:forEach var="i" begin="${pb.startPageOfPageGroup}"
			end="${pb.endPageOfPageGroup}">
			<c:choose>
				<c:when test="${pb.nowPage!=i}">
					<li><a href="front?command=List&pageNo=${i}">${i}</a></li>
				</c:when>
				<c:otherwise>
					<li class="active"><a href="#">${i}</a></li>
				</c:otherwise>
			</c:choose>
	&nbsp;
	</c:forEach>
		<c:if test="${pb.nextPageGroup}">
			<li><a
				href="front?command=List&pageNo=${pb.endPageOfPageGroup+1}">&raquo;</a></li>
		</c:if>
	</ul>
</div>

</body>
</html>