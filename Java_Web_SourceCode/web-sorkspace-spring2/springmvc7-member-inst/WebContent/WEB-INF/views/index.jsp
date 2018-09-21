<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#findMemberByIdBtn").click(function(){
			$.ajax({
				type:"get",				
				url:"findMemberById.do",
				data:"id="+$("#memberId").val(),
				success:function(data){				
					 if(data==""){
						$("#nameView").text("");
						$("#addressView").text("");
					}else{
						$("#nameView").text(data.name);
						$("#addressView").text(data.address);
					} 
				}//success
			});
		});//click
		$("#address").change(function(){
			var addr=$(this).val();
			if(addr!=""){
				$.ajax({
					type:"get",
					url:"findMemberListByAddress.do",
					data:"address="+addr,
					success:function(result){
						//alert(result.length);
						var info="";
						for(var i=0;i<result.length;i++){
							info+="<tr>";
							info+="<td>"+result[i].id+"</td>";
							info+="<td>"+result[i].name+"</td>";
							info+="</tr>";
						}
						$("#listView").html(info);
					}
				});//ajax
			}else{
				$("#listView").html("");
			}
		});//change
	});//ready
</script>
<title>springmvc member</title>
</head>
<body>
<div class="container-fluid">
<h3>회원관리</h3>
총회원수 ${totalMemberCount} 명 <br><br>
<input type="text" id="memberId">
<input type="button" value="검색" id="findMemberByIdBtn">
회원명 <span id="nameView"></span>
주소 <span id="addressView"></span>
<%--
		ajax 방식으로 아이디를 전송해서 
		json 으로 응답받아 nameView와 addressView에 
		회원명과 주소를 보여준다 
 --%>
 <hr>
 <div class="row">
 <div class="col-sm-3"></div>
 <div class="col-sm-3">
 <select id="address">
 	<option value="">--주소--</option>
 	<c:forEach items="${addressList}" var="addr">
 	<option value="${addr}">${addr}</option> 
 	</c:forEach>
 </select>
 </div>
 <div class="col-sm-6">
 <table class="table table-bordered">
 	<thead>
 		<tr>
 			<th>아이디</th><th>이름</th>
 		</tr>
 	</thead>
 	<tbody id="listView"></tbody>
 </table>
 </div>
 </div>
 <%--		step1
 			첫 화면에 로딩될 때 jstl로 spring_member table에 
 			저장된 회원 주소 종류를 select option 으로 제공한다 
 			step2
 			select address 의 option이 변화 될 때 
 			ajax 방식으로 해당 주소의 회원리스트를 table로 
 			제공한다 
  --%>
  </div><!-- container div -->
  <c:choose>
  	<c:when test="${sessionScope.mvo==null}">
  		<form method="post" action="login.do">
		  아이디 <input type="text" name="id"><br>
		  패스워드 <input type="password" name="password"><br>
		  <input type="submit" value="로그인">
  		</form><br>
  		<a href="registerMemberForm.do">회원가입</a>
  		<%--		step1 회원가입처리 ( post 방식 ) 
  						   jsp : register_member_form.jsp 
  					step2 아이디 중복확인 ( jquery ajax keyup 이용해서 ) 
  		 --%>
  	</c:when>
  	<c:otherwise>
  		<a href="logout.do">로그아웃</a><br>
  		<a href="updateMemberForm.do">회원정보수정하기</a>
  	</c:otherwise>
  </c:choose>
  
  <%--		로그인 실패하면 
  				WEB-INF/views/login_fail.jsp 에서
  				alert 로그인실패 후 현페이지로 이동 
  				
  				로그인 성공하면 
  				위의 로그인 폼 대신  아이유님 로그인 으로 변경 
  				아래에 로그아웃 링크를 제공한다 
  				로그아웃 클릭하면 컨트롤러에서 로그아웃처리 후
  				다시 현화면을 제공하여 로그인폼이 보이게 한다 	
  				
   --%>
</body>
</html>


















