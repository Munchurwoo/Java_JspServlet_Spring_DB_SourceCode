<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="scott";
		String password="tiger";
		Connection con=DriverManager.getConnection(url, user, password);
		String sql="select count(*) from member";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		int totalCount=0;
		if(rs.next()){
			totalCount=rs.getInt(1);
		}
		rs.close(); 
		pstmt.close();
		con.close();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>총회원수</title>
</head>
<body>
	<a href="home.html">Home</a><hr>
	총회원수는 <%=totalCount %>명 입니다. 
</body>
</html>











