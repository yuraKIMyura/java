<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form-get/post</title>
</head>
<body>

	국어: <%=request.getParameter("kor") %> <br/>
	영어: <%=request.getParameter("eng") %> <br/>
	수학: <%=request.getParameter("math") %> <br/>
	

</body>
</html>