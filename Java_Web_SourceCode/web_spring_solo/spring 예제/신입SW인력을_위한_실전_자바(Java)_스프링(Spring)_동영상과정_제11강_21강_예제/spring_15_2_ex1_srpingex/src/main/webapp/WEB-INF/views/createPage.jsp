<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
createPage.jsp
<br />

<% 
	String conPath = request.getContextPath();
%>

<form action="student/create">
	이름 : <input type="text" name="name" value="${student.name}"> <br />
	아이디 : <input type="text" name="id" value="${student.id}"> <br />
	<input type="submit" value="전송"> <br />
</form>

</body>
</html>