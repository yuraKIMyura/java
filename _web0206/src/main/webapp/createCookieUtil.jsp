<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.addCookie(Cookies.createCookie("name", "홍길동"));
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create Cookie w/ util</title>
</head>
<body>
	<p>쿠키생성</p>
</body>
</html>