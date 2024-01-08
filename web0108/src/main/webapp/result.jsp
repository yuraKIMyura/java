<!--240108 jsp에서 java와 html 함께 사용하기-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String content = request.getParameter("mmm");
int num = Integer.parseInt(content);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<h1>구구단</h1>
<h2><%= content %>단</h2>

<%for(int i=1; i<=9; i++){
%>
	<h3> <%=num%> X <%=i%> = <%=num*i%> </h3>	
<%} %>
</body>
</html>