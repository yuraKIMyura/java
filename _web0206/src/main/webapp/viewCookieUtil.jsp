<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookies ck = new Cookies(request);
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view Cookie w/ util</title>
</head>
<body>

<%=ck.getValue("name") %> </br>

</body>
</html>