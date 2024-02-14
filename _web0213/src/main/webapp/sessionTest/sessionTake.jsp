<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Get</title>
</head>
<body>

	<h1>Session Get Code</h1>
	<p>session.getAttribute("sessionName")</p>
	<p>explicit type casting to String needed </p>
	<%
	String str = (String) session.getAttribute("세션이름");
	%>
	<p> 결과: <%=str %> </p>
	
	<button onClick="location.href='sessionRemoveAll.jsp'"> Session Remove All으로 이동</button>
	

</body>
</html>