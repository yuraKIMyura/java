<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8");
//post방식으로 넘어가기 때문에 이 줄을 추가해줘야 함

	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	Cookie[] cookies = request.getCookies();
	
	for(Cookie ck : cookies){
		if(ck.getName().equals(name)){
			ck.setValue(URLEncoder.encode(value, "utf-8"));
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
<title>update Cookie</title>
</head>
<body>

</body>
</html>