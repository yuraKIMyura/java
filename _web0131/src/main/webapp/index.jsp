<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form-get/post</title>
</head>
<body>

	<form action="result.jsp" method="post">
	
		<label>학년</label>
		<select name="grade">
			<option value="0" selected>선택</option>
			<option value="1">1학년</option>
			<option value="2">2학년</option>
			<option value="3">3학년</option>		
		</select>
		
		<br/>
		<br/>

		<label>국어</label> <input type="text" name="kor">
		<label>영어</label> <input type="text" name="eng">
		<label>수학</label> <input type="text" name="math">
		
		<br/>
		<br/>
		
		<label>예습 여부</label>
		<input type="radio" name="pre" value="y" > <label>예</label>
		<input type="radio" name="pre" value="n" checked> <label>아니오</label> 
		
		<br/>
		<br/>
		
		<label> 추가 학습이 필요한 과목 (복수선택가능) </label>
		<input type="checkbox" name="weak" value="kor"><label>국어</label>
		<input type="checkbox" name="weak" value="eng"><label>영어</label>
		<input type="checkbox" name="weak" value="math"><label>수학</label>
		
		<br/>
		<br/>	
	
		<input type="reset" value="취소">	
		<input type="submit" value="제출">
			
	
	</form>

	


</body>
</html>