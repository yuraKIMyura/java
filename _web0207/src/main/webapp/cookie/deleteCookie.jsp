<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("name");
	Cookie[] cookies = request.getCookies();
	for(Cookie ck : cookies){
		if(ck.getName().equals(name)){
			ck.setMaxAge(0);
			response.addCookie(ck);
			//브라우저 쿠키 파일에 해당 정보 저장
		}
	}
	response.sendRedirect("listCookies.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete Cookie</title>
</head>
<body>

</body>
</html>