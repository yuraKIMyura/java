<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM score WHERE num = ?");
    ){  pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
         
        pstmt.executeUpdate();
        response.sendRedirect("list.jsp?exceptionType=0"); 
        
    } catch(Exception e) {
        e.printStackTrace();
        response.sendRedirect("list.jsp?exceptionType=2");
    }
    
    
%>


</body>
</html>