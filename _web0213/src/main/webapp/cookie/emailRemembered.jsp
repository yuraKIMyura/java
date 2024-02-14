<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remembered</title>
</head>
<body>

<% 
String check = request.getParameter("check");
String email = request.getParameter("email"); 


	Cookie cookie = new Cookie("email", null);
	if(check!=null && check.equalsIgnoreCase("on")){
		cookie.setValue(email);
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);	
	}else{
		cookie.setValue("");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}
%>


<p>check: <%= check %> </p>
<p>cookie name: <%= cookie.getValue() %> </p>

</body>
</html>