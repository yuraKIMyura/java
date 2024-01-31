<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multi select</title>
</head>
<body>

	<%request.setCharacterEncoding("utf-8");
	String[] lang = request.getParameterValues("lang");
	String resultLang = Arrays.toString(lang);
	String[] hobby = request.getParameterValues("hobby");
	String resultHobby = Arrays.toString(hobby);
	%>
	
	

	관심언어 <%=resultLang%> <br/>
	
	<br/>

	취미 <%=resultHobby%> <br/> 

	
</body>
</html>