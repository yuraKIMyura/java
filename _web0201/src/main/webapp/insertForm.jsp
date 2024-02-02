<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oracle+JDBC</title>
</head>
<body>

	<a href="index.jsp">목록으로</a> </br>

	<form action="insert.jsp" method="post">
	
		<label>이름</label> <input type="text" name="ename"> </br>
		<label>직무</label> <input type="text" name="job"> </br>
		<lable>급여</lable> <input type="text" name="sal"> </br>
		
		<input type="submit" value="입력">
		<input type="reset" value="취소">
		
	</form>

</body>
</html>