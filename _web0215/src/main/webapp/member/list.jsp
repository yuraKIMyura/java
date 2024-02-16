<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="dto.Board" %>

<%
	//로그인 여부 확인해서 로그인 안 한 경우 로그인 창으로 보내기
	String memberId = (String) session.getAttribute("MEMBERID");
	if (memberId == null) {
		response.sendRedirect("sessionLoginForm.jsp");
	}
%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>


<div class="container" style="padding-top: 50px">

<table class="table table-bordered table-hover">
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
<%

	BoardDao dao = BoardDao.getInstance();
	List<Board> list = dao.selectList();

	for(Board board : list) {
%>		
		
	<tr>
        <td><%=board.getNum()%></td>
        <td style="text-align:left;"><a href="view.jsp?num=<%=board.getNum()%>"><%=board.getTitle()%></a></td>
        <td><%=board.getWriter()%></td>
        <td><%=board.getRegtime()%></td>
        <td><%=board.getHits()%></td>
     </tr>	

<%		
	}
%>         

</table>

<br>
<button type="button" class="btn btn-primary" onclick="location.href='write.jsp'">글쓰기</button>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
