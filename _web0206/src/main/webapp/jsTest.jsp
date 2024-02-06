<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button onClick="test()">클릭</button>
<h1 id="title">안녕 JSP</h1>
<h1 id="title2">안녕 JSP</h1>
<h1 class="title3">안녕 JSP</h1>

<script>
function test(){
 	let str = document.getElementById("title");
 	let str2 = document.querySelector("#title2");
	let str3 = document.querySelector(".title3");
	
 	str.innerHTML = "테스트1";
 	str2.innerHTML = "테스트2";
 	str3.innerHTML = "테스트3";
}
</script>

</body>
</html>