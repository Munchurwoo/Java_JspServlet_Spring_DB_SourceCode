<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>form</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#testForm").submit(function(){
			//return confirm("전송 하시겠습니까?");
			//alert($("#userId").val());
			//$("#userId").val("").focus();
			//select option 에 접근해서 값을 출력 
			//alert($("#hp").val());
			//radio button 특성상 동일한 name 으로 여러개 정의되고 
			//이 중 선택된 라디오 버튼 값만 출력하도록 select  해 본다. 
		
			var ra = $("#testForm :radio[name=gender]:checked")
			//alert(ra.length);
			if(ra.length>0){
				alert(ra.val());
			}else{
				alert("성별을 선택하세요.")
			} 
			//체크 박스도 이와 같은 방식으로 선택된 게 없으면 취미를 선택하세요! 
			//또는 선택된 취미를 alert 로 출력해본다.
			
			var hobby = $("#testForm :checkbox[name=hobby]:checked");
			if(hobby.length>0){
				var a = "";
				for(var i=0; i<hobby.length;i++){
					//hobby jquery 객체, hobby[i] 는 javascript 객체이므로 
					//$(hobby[i] 와 같이 jquery 객체로 만들어야 val() 과 같은 
					//jquery function 이용할 수 있다.
					//alert($(hobby[i]).val());
					a = a+$(hobby[i]).val()+" ";
				}
					alert(a);
			}else{
				alert("취미를 선택하세요.");
			}
			return false;
		});
	})
</script>
</head>
<body>
<form action="test.jsp" id="testForm">
 아이디 <input type="text" id="userId" name="userId"><br><br>
 <select id="hp">
  <option value="">--</option>
  <option value="sk">sk</option>
  <option value="kt">kt</option>
  <option value="lg">lg</option>
 </select><br><br>
 <input type="radio" name="gender" value="male">남 
 <input type="radio" name="gender" value="female">여 
 <br><br><br>
 <input type="checkbox" name="hobby" value="노래">노래<br>
 <input type="checkbox" name="hobby" value="코딩">코딩<br>
 <input type="checkbox" name="hobby" value="독서">독서<br>
 <input type="submit" value="전송">
</form>
</body>
</html>