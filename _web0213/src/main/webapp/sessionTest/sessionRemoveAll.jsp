<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
session.invalidate(); 
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session invalidate</title>
</head>
<body>

	<h1>Session Invalidate Code</h1>
	<p>session.invalidate()</p>
	<p>모든 세션 삭제 </p>

	<button onClick="location.href='sessionTake.jsp'"> Session Get으로 이동</button>

</body>
</html>