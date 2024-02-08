<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String nameU =""; 
	String valueU = "";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	table.list { 
		width: 500px; 
		text-align: center; 
	}
	
	table.input { 
		text-align: center; 
		border: 1px solid black;
	}
	
	table.input td {
		width:80px;
	}
	
	th    { 
		background-color: cyan; 
	}
</style>
<title>list Cookies</title>
</head>
<body>

<form method="post" id="frm">
	<table class="input">
		<tr>
			<td>쿠키 이름</td>
			<td colspan="2"><input type="text" name="name" value=<%=nameU%>></td>
		</tr>
		<tr>
			<td>쿠키 값</td>
			<td colspan="2"><input type="text" name="value" value=<%=valueU%>></td>
		</tr>
		<tr>
			<td> <button onClick="insert()">입력</button> </td>
			<td> <button onClick="update()">수정</button> </td>
			<td> <button onClick="reset()">취소</button> </td>
		</tr>
	</table>
</form>



<br/>
<br/>

<table class="list">
    <tr>
        <th>쿠키 이름</th>
        <th>쿠키 값</th>
        <th>쿠키 삭제</th>
    </tr>
    
<%  Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for (Cookie ck : cookies){
%>  
    <tr>
         <td><%=ck.getName()%></td>
         <td><%=URLDecoder.decode(ck.getValue(), "utf-8")%></td>
         <td><a href="deleteCookie.jsp?name=<%=ck.getName()%>">삭제</a></td>
    </tr>
    
<%
		}
	}
%>
</table>

<script>
	function insert(){
		document.getElementById('frm').action='createCookie.jsp';
		document.getElementById('frm').submit();	
	}
	
	function update(){
		document.getElementById('frm').action='updateCookie.jsp';
		document.getElementById('frm').submit();	
	}
	
	function clean(){
		for(var i=0; i<el.length; i++){
			el[i].value = '';
		}
	}
</script>


</body>
</html>