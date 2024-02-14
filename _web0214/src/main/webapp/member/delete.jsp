<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
<%@ page import="dto.Board" %>
<%@ page import="dao.BoardDao"%>
    
<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num"));


	BoardDao dao = BoardDao.getInstance();
	int result = dao.delete(num);
	System.out.println("삭제 결과: " + result);
	
	if(result == 1) {
%>
	<script>
		alert("삭제에 성공했습니다.");
	</script>
		
<%
	response.sendRedirect("list.jsp");
	} else {
%>	
	<script>
		alert("삭제에 실패했습니다.");
	</script>
	
<%	
	response.sendRedirect("list.jsp");
}
   
%>