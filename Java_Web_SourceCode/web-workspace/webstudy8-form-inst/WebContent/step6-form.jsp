<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox test</title>
<script type="text/javascript">
	function checkForm(){
		var angelArray=document.getElementsByName("angel");
		var flag=false;
		for(var i=0;i<angelArray.length;i++){
			if(angelArray[i].checked){
				flag=true;
				break;
			}//if
		}//for
		if(flag==false){
			alert("엔젤을 선택하세요");
		}
		return flag;
	}//function
</script>
</head>
<body>
<form action="step6-action.jsp" onsubmit="return checkForm()">
<input type="checkbox" name="angel" value="현수엔젤">신현수<br>
<input type="checkbox" name="angel" value="동원엔젤">강동원<br>
<input type="checkbox" name="angel" value="태리엔젤">김태리<br>
<input type="submit" value="선택">
</form>
<%--
			checkbox angel 중 하나 이상 선택하지 않고
			submit 버튼 누를 경우 
			alert() 으로 엔젤을 선택하세요!  보여주고 
			전송시키지 않는다 
			하나 이상 선택하면 전송시킨다 
 --%>
</body>
</html>












