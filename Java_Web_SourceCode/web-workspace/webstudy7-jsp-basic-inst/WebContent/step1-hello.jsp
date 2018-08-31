<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp basic</title>
</head>
<body>
<!-- html 주석 -->
<%-- jsp 주석 --%>
jsp 기본 문법 연습 <br>
<% 	// service() 메서드 내에 생성되는 지역변수 
		int age=22;
%>  나이 <%=age%> 세  
<%!    // 인스턴스 변수로 선언,초기화 
		int age=33;
%>  <hr>
지역변수 age와 인스턴스 변수 age의 합:<%=age+this.age %>
<hr>
현재시간은 <%=new Date().toString() %>
</body>
</html>




















