<%@page import="org.kosta.model.MemberDAO"%>
<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%MemberVO mvo = (MemberVO)session.getAttribute("vo");
	if(session!=null){
		session.invalidate();
		%>
		<script type="text/javascript">
			location.href="index.jsp";
		</script>
		<%
	}
	%>
</body>
</html>