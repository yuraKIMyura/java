<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("name", "홍길동"); //servlet에서 포워딩 되었다고 가정
	request.setAttribute("arr2", new int[]{10,20,30,40,50});
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:forEach var="v" items="${arr2}" varStatus="st">
${v} : ${st.index} : ${st.count}  <br>
</c:forEach>

------<br>

${ intArray = {1, 2, 3, 4, 5}; '' }
<c:forEach var="i" items="${ intArray }" varStatus="st">
${ i } <br>
</c:forEach>

------<br>

${name} <br>

------<br>
 
 <c:forEach var="i" begin="0" end="10" step="2">
${i}
${ sta.index } <br>
${ s = s + i; '' }
</c:forEach>
1-10에서 짝수의 합: ${ s } <br>

 
</body>
</html>