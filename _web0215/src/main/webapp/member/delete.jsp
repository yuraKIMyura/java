<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
<%@ page import="dto.Board" %>
<%@ page import="dao.BoardDao"%>
    
<%

	//로그인 여부 확인해서 로그인 안 한 경우 로그인 창으로 보내기
	String memberID = (String) session.getAttribute("MEMBERID");
	if(memberID == null) {
		response.sendRedirect("sessionLoginForm.jsp");
	}

    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num"));


	BoardDao dao = BoardDao.getInstance();
	int result = dao.delete(num);
	
	if(result == 1) {
%>
	<script>
		alert("삭제에 성공했습니다.");
		location.href="list.jsp";
	</script>		
<%
/* 	response.sendRedirect("list.jsp"); 서버에서 작동*/
	} else {
%>	
	<script>
		alert("삭제에 실패했습니다.");
	</script>
	
<%	
/* 	response.sendRedirect("list.jsp");
 */}
   
%>