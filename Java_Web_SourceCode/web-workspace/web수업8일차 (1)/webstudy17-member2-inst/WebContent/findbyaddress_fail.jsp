<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색실패</title>
</head>
<body>
<script type="text/javascript">
alert("<%=request.getParameter("address")%>에 사는 회원이 존재하지 않습니다");
location.href="index.jsp";
</script>
</body>
</html>









