<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8"); //이건 get parameter를 위해서

String name = request.getParameter("name");
String value = request.getParameter("value");

Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8")); //이건 cookie 생성을 위해서
response.addCookie(cookie);
response.sendRedirect("listCookies.jsp");
%>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create Cookie</title>
</head>
<body>

</body>
</html>