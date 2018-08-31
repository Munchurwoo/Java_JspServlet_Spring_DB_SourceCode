<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VO 와 List를 jsp로 표현</title>
</head>
<body>
	<%
		MemberVO vo = new MemberVO("최요셉", 24);
	%>
	회원이름:
	<%=vo.getName()%>
	<br> 회원나이:
	<%=vo.getAge()%>세
	<hr>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("순대국");
		list.add("탕수육");
		list.add("쌀국수");
	%>
	<%--		1. 순대국
			2. 탕수육
			3. 쌀국수 
 --%>
	<%
		for (int i = 0; i < list.size(); i++) {
	%>
	<%=i + 1%>.
	<%=list.get(i)%><br>
	<%
		}
	%>
	<hr>
	<%
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
		memList.add(new MemberVO("신현수", 29));
		memList.add(new MemberVO("최요셉", 24));
		memList.add(new MemberVO("문준위", 29));
	%>
	<%--		1. 신현수 29
				2. 최요셉 24
				3. 문준위 29
	 --%>
	<%
		for (int i = 0; i < memList.size(); i++) {
	%>
		<%=i+1%>. <%=memList.get(i).getName() %> 
		<%=memList.get(i).getAge() %><br>	
	<%
		}
	%>
</body>
</html>
























