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
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger"); 
    	PreparedStatement pstmt = conn.prepareStatement("CREATE TABLE score ( num NUMBER(3,0) PRIMARY KEY, name VARCHAR2(20), kor NUMBER(5,2), eng NUMBER(5,2), math NUMBER(5,2))");
    ) {
    	
    
        pstmt.executeUpdate();
        out.println("성적 테이블 생성 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>