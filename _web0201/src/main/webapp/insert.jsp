<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oracle+JDBC</title>
</head>
<body>

<%
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "INSERT INTO emp1 (ename, job, sal) VALUES (?, ?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "SUNDE");
pstmt.setString(2, "DEVELOPER");
pstmt.setDouble(3, 99999.99);
int result = pstmt.executeUpdate();
if(result==1){
	out.println("입력성공");
}
%>



</body>
</html>