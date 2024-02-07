<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Cookie[] cookies = request.getCookies();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get Cookies</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	if(cookies!=null){
		for(Cookie ck : cookies){
			String name = ck.getName();
			String value = URLDecoder.decode(ck.getValue(),"utf-8");
			out.print("key: "+name + " / " + "value: " + value + "<br/>");
		}
	}
%>

</body>
</html>