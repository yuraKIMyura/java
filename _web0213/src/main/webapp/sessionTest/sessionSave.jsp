<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
session.setAttribute("세션이름", "세션값"); 
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Save</title>
</head>
<body>

	<h1>Session Save Code</h1>
	<p>session.setAttribute("sessionName", "sessionValue")</p>
	
	<button onClick="location.href='sessionTake.jsp'"> Session Get으로 이동</button>

</body>
</html>