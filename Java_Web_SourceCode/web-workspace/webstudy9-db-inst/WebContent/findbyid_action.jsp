<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "scott";
	String password = "tiger";
	Connection con = DriverManager.getConnection(url, user, password);
	String sql = "select name,address from member where id=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	//id를 전달받는다
	String id = request.getParameter("memberId");
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	String name = null;
	String address = null;
	if (rs.next()) {
		name = rs.getString(1);
		address = rs.getString(2);
	}
	rs.close();
	pstmt.close();
	con.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (name != null) {
	%>		아이디 : <%=id %><br>
			이름 : <%=name %><br>
			주소 : <%=address %>
	<%
		} else {
	%>		
		<script type="text/javascript">
			alert("회원이 존재하지 않습니다");
			location.href="home.html";
		</script>
			
	<%
		}
	%>

</body>
</html>






