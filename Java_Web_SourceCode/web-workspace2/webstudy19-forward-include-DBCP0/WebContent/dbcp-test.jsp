<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javax.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Insert title here</title>
</head>
<body>

	<%	
		request.setCharacterEncoding("utf-8");
		Connection oldCon = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
	%>기존 방식으로 생성한 컨넥션 : <%=oldCon.getClass() %>
	<% oldCon.close(); %>	
	<hr>
	<%
		DataSource dataSource = DataSourceManager.getInstance().getDataSource();  
		Connection con = dataSource.getConnection();
	%>
	빌려온 컨넥션 :	<%=con.getClass()%>
	<% con.close(); %>
</body>
</html>