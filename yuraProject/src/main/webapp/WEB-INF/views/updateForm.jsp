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

	<form action="commitUpdate" method="post">
		<table>
			<tr>
				<td> <input type="hidden" name="id" value="${member.id}"> </td>
			</tr>
		
			<tr>
				<th>이름</th>
				<td> <input type="text" name="name" value="${member.name}">  </td>
			</tr>
			<tr>
				<th>나이</th>
				<td>  <input type="text" name="age" value="${member.age}">  </td>
			</tr>
			<tr>
				<th>메일</th>
				<td>  <input type="text" name="email" value="${member.email}">  </td>
			</tr>
			<tr>
				<th>메모</th>
				<td> <input type="text" name="memo" value="${member.memo}">   </td>
			</tr>
			<tr>
				<td colspan=2 align="right"> <button type="submit">수정완료</button> </td>
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
			</tr>
		</c:forEach>
            </tbody>


</table>
</body>
</html>