<%@page import="java.sql.Connection"%>

<%@page import="org.kosta.model.DataSourceManager"%>
<%@page import="javax.sql.DataSource"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.sql.*, java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcp-test.jsp</title>
</head>
<body>
<%
	Connection oldCon = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott","tiger");
%>기존 방식으로 생성한 컨넥션 : <%=oldCon.getClass() %>
<%
	oldCon.close();//생성한 컨넥션을 소멸시킨다
%>
<hr>
<%
	DataSource dataSource = DataSourceManager.getInstance().getDataSource();
	Connection con = dataSource.getConnection();
%>dbcp로부터 빌려온 컨넥션:<%=con.getClass() %>
<%
	con.close();//빌려온 컨넥션을 dbcp로 반납한다
%>
</body>
</html>