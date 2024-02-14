<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head><title>로그인폼</title></head>
<body>

<form action="<%= request.getContextPath() %>/memberBoard/sessionLogin.jsp"
      method="post">
num <input type="text" name="num" size="10">
writer <input type="text" name="writer" size="10">
<input type="submit" value="로그인">
</form>

</body>
</html>
