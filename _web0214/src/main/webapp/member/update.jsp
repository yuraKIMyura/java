 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
     
 <%@ page import="java.sql.*" %>  
 <%@ page import="java.time.*" %>
 
 <%@ page import="dto.Board" %>
 <%@ page import="dao.BoardDao" %>
  
 <%
 
 	request.setCharacterEncoding("utf-8");
 
	 //로그인 여부 확인해서 로그인 안 한 경우 로그인 창으로 보내기
	 String memberID = (String) session.getAttribute("MEMBERID");
	 if(memberID == null) {
	 	response.sendRedirect("sessionLoginForm.jsp");
	 }
 
     // 전달받은 값 읽기
     int num = Integer.parseInt(request.getParameter("num"));
     String writer = request.getParameter("writer" );
     String title = request.getParameter("title"  );
     String content = request.getParameter("content");
 
     // 빈 칸이 하나라도 있으면 오류 출력하고 종료
     if (writer  == null || writer.trim().length()  == 0 ||
         title   == null || title.trim().length()   == 0 ||
         content == null || content.trim().length() == 0) {
 %>      
         <script>
             alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
             history.back();
         </script>
 <%        
         return;
     }
     
     BoardDao dao = BoardDao.getInstance();
     
     String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
     Board board = new Board(num, writer, title, content, curTime);
     
     System.out.println(board);
     int result = dao.update(board);
     System.out.println(result);
     
     // 글 보기 화면으로 돌아감
     response.sendRedirect("view.jsp?num=" + num);
 %>     
 