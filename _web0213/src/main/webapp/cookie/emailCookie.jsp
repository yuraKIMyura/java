<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>email</title>
</head>
<body>


<form method="post" action="emailRemembered.jsp">

    
<% 

String email = "";

Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(Cookie ck : cookies) {
		if(ck.getName().equals("email")){
			email = ck.getValue();
		}
	}
}
%>			

	<label>email</label>
	<input type="text" name="email" value=<%=email%>>
				
	<label>RememberMe</label>
	<input type="checkbox" name="check">
	
	<button type="submit">로그인</button>

</form>	

</body>
</html>