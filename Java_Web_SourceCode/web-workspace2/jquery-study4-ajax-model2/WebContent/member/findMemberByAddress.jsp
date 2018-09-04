<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>회원검색</title>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-sm-offset-2">
				<script type="text/javascript">
				$(document).ready(function() {
					$("#address").change(function(){
						$.ajax({
							type:"get",
							url:"${pageContext.request.contextPath}/front",
							dataType:"json",
							data:$("#addressForm").serialize(),
							success:function(json){
								//alert(json);
								//membody id 영역에 회원정보를 할당한다 
								var info="";
								for(var i=0;i<json.length;i++){
									info+="<tr>";
									info+="<td>"+json[i].id+"</td>";
									info+="<td>"+json[i].name+"</td>";
									info+="</tr>";
								}
								$("#membody").html(info);
							}
						});//ajax
					});//change
				});//ready
			</script>
				<a href="index.jsp">홈</a><br> <br>
				<form id="addressForm">
					<input type="hidden" name="command" value="findMemberByAddress">
					<select name="address" id="address">
						<c:forEach items="${requestScope.list}" var="address">
							<option value="${address}">${address}</option>
						</c:forEach>
					</select>
				</form>
			</div>
			<div class="col-sm-3">
				<br> <br>
				<table class="table  table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
						</tr>
					</thead>
					<tbody id="membody">

					</tbody>
				</table>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<!--  row  -->
	</div>
	<!-- container -->
</body>
</html>