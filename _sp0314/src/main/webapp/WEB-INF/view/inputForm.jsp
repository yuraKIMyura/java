<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- form action에 지정된 이름은 controller의 URI template이다. -->
<form action="result" method="post">

<label> id <input type="text" name="id"> </label>
<label> email <input type="text" name="email"> </label>
<label> 입력 <input type="submit"></label>
</form>

</body>
</html>