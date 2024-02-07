<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Cookie cookie = new Cookie("aaa", URLEncoder.encode("홍길동", "utf-8"));
response.addCookie(cookie);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make Cookie</title>
</head>
<body>

<p>쿠키생성</p>
<button onclick="location.href='getCookies.jsp'">쿠키보기</button>

</body>
</html>