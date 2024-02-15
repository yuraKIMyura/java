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

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>

<table>
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
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">

</body>
</html>
