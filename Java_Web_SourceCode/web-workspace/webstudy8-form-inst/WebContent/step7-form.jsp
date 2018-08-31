<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("족발");
	list.add("곱창");
	list.add("소주");
	list.add("양주");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox</title>
<script type="text/javascript">
	function checkForm(){
		var fa=document.getElementsByName("food");
		var flag=false;
		for(var i=0;i<fa.length;i++){
			if(fa[i].checked){
				flag=true;
				break;
			}
		}
		if(flag==false)
			alert("메뉴를 선택하세요");
		return flag;
	}
</script>
</head>
<body>
	<form method="post" action="step7-action.jsp" onsubmit="return checkForm()">
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<input type="checkbox" name="food" value="<%=list.get(i)%>"><%=list.get(i)%><br>
		<%
			}
		%>
		<input type="submit" value="주문">
	</form>
	<%-- 
 1. name이 food인 checkbox를 list를 이용해 생성한다
 2. javascript로 체크박스 상태를 확인 후 선택된 항목이 없을 경우 
    alert으로 음식을 선택하세요 후 전송시키지 않는다 
 3. 선택해서 주문 버튼 누르면 
 	step7-action.jsp에서는 테이블 형식으로 주문 정보를 제공한다 
 	
 	순번	메뉴명
 	1		곱창
 	2       소주    
 --%>
</body>


















</html>