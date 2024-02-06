<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get cookie</title>
</head>
<body>

<%
	Cookie cookie[] = request.getCookies();
	out.print("쿠키의 개수: " + cookie.length+"개 <br/>");
	if(cookie != null) {
		for(Cookie ck : cookie){
			out.println("[쿠키이름] " + ck.getName() + " = [쿠키값] " + ck.getValue() + "<br/>");
		}		
	}
%>

</body>
</html>