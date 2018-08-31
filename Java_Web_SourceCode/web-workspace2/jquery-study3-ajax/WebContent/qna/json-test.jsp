<%@page import="org.json.JSONArray"%>
<%@page import="model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<ProductVO> list=new ArrayList<ProductVO>();
	list.add(new ProductVO("갤럭시6",100));
	list.add(new ProductVO("아이폰7",120));
	JSONArray arr=new JSONArray(list);
	request.setAttribute("jlist", arr);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json test</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var jsonList=${requestScope.jlist};
		for(var i=0;i<jsonList.length;i++)
		alert(jsonList[i].name+" "+jsonList[i].price);
	});
</script>
</head>
<body>
${requestScope.jlist}
</body>
</html>