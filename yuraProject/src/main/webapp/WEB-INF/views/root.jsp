<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>유라프로젝트</h1>

	<form action="register" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td> <input type="text" name="name"> </td>
			</tr>
			<tr>
				<th>나이</th>
				<td>  <input type="text" name="age"> </td>
			</tr>
			<tr>
				<th>메일</th>
				<td>  <input type="text" name="email"> </td>
			</tr>
			<tr>
				<th>메모</th>
				<td> <input type="text" name="memo"> </td>
			</tr>
			<tr>
				<td colspan=2 align="right"> <button type="sumbit">등록</button> </td>
			</tr>					
		</table>
	</form>

<hr>

<table>
<thead>
	<tr>
			<th>ID</th>
			<th>이름</th>
			<th>나이</th>
			<th>메일</th>
			<th>메모</th>
			<th>Actions</th>						
	</tr>
<thead>
<tbody>
       <c:forEach var="member" items="${allList}">
        <tr>
        <td> ${member.id} </td>
        <td> ${member.name} </td>
        <td> ${member.age} </td>
        <td> ${member.email} </td>
        <td> ${member.memo} </td>
			<td> 
				<button onclick="location.href='/update?id=${member.id}'">수정</button> 
				<button onclick="location.href='/delete?id=${member.id}'">삭제</button>
			</td>												
			</tr>
		</c:forEach>
            </tbody>


</table>
</body>
</html>