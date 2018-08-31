<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색결과</title>
</head>
<body>
<%		
		String id=request.getParameter("memberId");	
		MemberVO vo=MemberDAO.getInstance().findMemberById(id);
		if(vo!=null){
%>			아이디 : <%=id %><br>
		    이름 : <%=vo.getName() %><br>
		    주소 : <%=vo.getAddress() %>
<%    }else{ %>
			<script type="text/javascript">
				alert("<%=id%> 아이디에 해당하는 회원이 없습니다!");
				location.href="home.html";
			</script>
<%		} %>
</body>
</html>









