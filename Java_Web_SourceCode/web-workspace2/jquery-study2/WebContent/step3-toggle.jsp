<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#toggleSpan").click(function() {
			$("#detailInfo").slideToggle(1000, function() {
				// Animation complete.
				//alert($(this).css("display")=="none");
				var flag= $(this).css("display")=="none";
				/* alert(flag); */
				if(flag==false)
					$(toggleSpan).text("접기");
				else{
					$(toggleSpan).text("정보 더보기");
				}
			});
		});
	})
</script>
<title>step1-toggle</title>
<style type="text/css">
#toggleSpan {
	background-color: yellow;
}

#detailInfo {
	display: none;
}
</style>

</head>
<body>
	<%-- 정보 더보기와 접기가 번갈아 가면서 표현된다 
	   detailInfo의 정보가 보이는 상태이면 접기가 표현되고
	   detailInfo의 정보가 보이지 않는 상태이면 정보 더보기가 표현된다 
	   toggleSpan 을 클릭하면 아래 detailInfo가 보이는 상태와 
	   보이지 않는 상태로 번갈아 가면서 수행한다 	
  --%>
	<span id="toggleSpan">정보 더보기</span>
	<br>
	<br>
	<p id="detailInfo">
		본명 이지은(李知恩)[1]<br>
		<br> 출생 1993년 5월 16일, 서울특별시 성동구 송정동[2] / 24세<br>
		<br> 국적 대한민국파일:대한민국 국기.png<br>
		<br> 본관 전주 이씨[3]<br>
		<br> 신체 161.7cm, 44kg[4][5], A형<br>
		<br> 가족 부모님, 남동생<br>
		<br>
	</p>
</body>
</html>








