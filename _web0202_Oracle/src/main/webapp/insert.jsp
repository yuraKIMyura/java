<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO score (num, name, kor, eng, math) VALUES (?, ?, ?, ?, ?)");
    ){  pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
        pstmt.setString(2, request.getParameter("name"));
        pstmt.setDouble(3, Double.parseDouble(request.getParameter("kor")));
        pstmt.setDouble(4, Double.parseDouble(request.getParameter("eng")));
        pstmt.setDouble(5, Double.parseDouble(request.getParameter("math")));
         
        pstmt.executeUpdate();
        out.println("쿼리 실행 성공");
        response.sendRedirect("list.jsp?exceptionType=0"); 
        
    } catch(Exception e) {
        e.printStackTrace();
        response.sendRedirect("list.jsp?exceptionType=1");
    }
    
    
%>

</body>
</html>