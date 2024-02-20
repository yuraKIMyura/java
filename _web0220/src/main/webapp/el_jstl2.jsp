<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl 조건문</title>
</head>
<body>

<c:choose>
<c:when test="${ param.num == 1 }">
num은 1입니다.
</c:when>
<c:when test="${ param.num == 2 }">
num은 2입니다.
</c:when>
<c:otherwise>
num은 ${ param.num }입니다.
</c:otherwise>
</c:choose>

<br>

<c:if test="true">무조건 실행</c:if>

<br>

${ bbb = 50; ''}
<c:if test="${ bbb < 100 }">bbb는 100보다 작다</c:if>

<br>

${ sum=0; '' }
<c:forEach var="i" begin="1" end="100">
${ sum = sum+i; '' }
</c:forEach>
결과: ${ sum }
<br>	

${ sum=0; '' }
<c:forEach var="vv" begin="2" end="5" varStatus="st">
${ sum = sum+vv; '' }
${ st.index } - ${ st.count } <br>
</c:forEach>
결과: ${ sum }
<br>	


</body>
</html>