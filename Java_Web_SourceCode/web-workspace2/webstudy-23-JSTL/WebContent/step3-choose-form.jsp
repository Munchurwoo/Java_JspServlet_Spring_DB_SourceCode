<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="step4-choose-action.jsp" method="get">
		이름 : <input type="text" name="name"><br>
		나이 <input type="text" name="age"><br>
		<input type="submit" value="전송">
	</form>
	<%-- 
		tep4-choose-action.jsp 에서는 19세 이상이면 아이유님 26세 성인입니다 
		13세 이상이면 아이유님 15세 청소연입니다. 
		1세~13세 미만이면 
		아이유님 11세 어린이 입니다. 
		1세 미만이면 
		아이유님 출생전입니다. 
	 --%>
</body>
</html>