<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie test</title>
</head>
<body>

	
	<%
	Cookie cookie = new Cookie("id", "admin");
	cookie.setMaxAge(60); //60초 동안 유효한 쿠키
	cookie.setMaxAge(0); //쿠키 삭제 기능
	response.addCookie(cookie);
	%>
	
	<%=cookie.getName()%> </br>
	<%=cookie.getValue()%> </br>

</body>
</html>