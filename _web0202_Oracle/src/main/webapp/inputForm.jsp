<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가</title>
</head>
<body>


<form action="insert.jsp" method="post">

	<table>
		<tr> 
			<td>번호</td>
			<td><input type="text" name="num">
		</tr>
		
		<tr> 
			<td>이름</td>
			<td><input type="text" name="name">
		</tr>
		
		<tr> 
			<td>국어</td>
			<td><input type="text" name="kor">
		</tr>
		
		<tr> 
			<td>영어</td>
			<td><input type="text" name="eng">
		</tr>
		
		<tr> 
			<td>수학</td>
			<td><input type="text" name="math">
		</tr>
		
		<tr>
			<td> <button type="submit">추가</button></td>
			<td> <button type="reset">취소</button></td>
		</tr>
	
	</table>
</form>

</body>
</html>