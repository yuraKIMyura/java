<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yura</title>
</head>
<body>

	<% Date now = new Date(); %>
	<%= now %>

	<h1>Hello</h1>

	<p>for loop
	<% int sum=0;
	for(int i=0; i<101; i++) {
		sum+=i;
	}
	%>
	<%= sum %>
	</p>
	
	<%!
	public static String print(){
		return "method를 사용한 프린트";
	}%>
	<%=print() %>
	

</body>
</html>