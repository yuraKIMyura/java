<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form-get/post</title>
</head>
<body>

	학년 <%=request.getParameter("grade")%> <br/>
	
	<br/>

	국어 <%=request.getParameter("kor")%> <br/> 
	영어 <%=request.getParameter("eng")%> <br/>
	수학 <%=request.getParameter("math")%> <br/>
	
	<br/>
	
	예습여부 <%=request.getParameter("pre")%> <br/>


	<br/>
	<%
	String[] list = request.getParameterValues("weak");
	String result = Arrays.toString(list);
	%>
	추가학습 필요과목 <%=result%> <br/>
	
</body>
</html>