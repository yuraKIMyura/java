<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl 기본</title>
</head>
<body>

 ${100+200; 30+1} <!-- 100+200 안 나오고, 31만 나옴 --> <br>
 <!-- 표현언어를 썼는데, 화면에 안 보이게 하고 싶으면 뒤에 ; '' 붙이면 됨 -->
 ${sum=0; ''} <br>
 ${sum=sum+100; ''} <br>
 ${name='charlatan'} <br>
 ${name=='한솔' } <br>
 ${empty sum } <br>
<br>


</body>
</html>