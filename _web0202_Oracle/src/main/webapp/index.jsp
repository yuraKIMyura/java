<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
 <style>
        table { width: 500px; text-align: center;}
        th    { background-color: #3652AD; color: white}
        tr	  { background-color: #E9F6FF;}
        button#nav { background-color:#FE7A36; color:white; width:100px; height:30px;}
        button { background-color: #280274; border: none; color:white; border-radius:2px}
    </style>    
</head>
<body>

<br/>
<br/>


<button id="nav" onClick="location.href='list.jsp'"> 학생 목록 </button>

<br/>
<br/>

<button id="nav" onClick="location.href='subject.jsp'"> 과목별 점수 </button>


</body>
</html>