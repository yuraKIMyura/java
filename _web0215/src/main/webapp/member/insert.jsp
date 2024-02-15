<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
<%@ page import="java.time.*" %>

 <%@ page import="dto.Board" %>
 <%@ page import="dao.BoardDao" %>
 
<%

	//로그인 여부 확인해서 로그인 안 한 경우 로그인 창으로 보내기
	String memberID = (String) session.getAttribute("MEMBERID");
	if(memberID == null) {
		response.sendRedirect("sessionLoginForm.jsp");
	}
	
    request.setCharacterEncoding("utf-8");

    // 양식에 입력되었던 값 읽기
    String writer  = request.getParameter("writer" );
    String title   = request.getParameter("title"  );
    String content = request.getParameter("content");

    // 빈 칸이 하나라도 있으면 오류 출력하고 종료
    if (writer  == null || writer.length()  == 0 ||
        title   == null || title.length()   == 0 ||
        content == null || content.length() == 0) {
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
    Board board = new Board(writer, title, content, curTime);
    
    System.out.println(board);
    int result = dao.insert(board);
    System.out.println(result);
    
    // 목록보기 화면으로 돌아감
    response.sendRedirect("list.jsp");
%>     