<!--240108 JSP에서 Java Class 사용하기 (src > main > java > web0108) -->
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web0109.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%for(int i=0; i<Student.names.length; i++){%>
	<%=Student.names[i]%> </br>
<%} %>
</body>
</html>