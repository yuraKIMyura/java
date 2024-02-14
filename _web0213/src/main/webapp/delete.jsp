<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
    
<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num"));

    // 지정된 글 번호의 레코드를 DB에서 삭제
    Class.forName("com.mysql.cj.jdbc.Driver");
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/project1", "root", "mysql");
        PreparedStatement pstmt = conn.prepareStatement("delete from board where num=?");
    ) {
        // 쿼리 실행
        pstmt.setInt(1, num);
        pstmt.executeUpdate();
        
    } catch(Exception e) {
        e.printStackTrace();
    }
    
    // 목록보기 화면으로 돌아감
    response.sendRedirect("list.jsp");
%>