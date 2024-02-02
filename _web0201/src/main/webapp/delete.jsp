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
request.setCharacterEncoding("UTF-8");

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "DELETE FROM emp1 WHERE ename = ? ";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1,request.getParameter("ename"));
pstmt.executeUpdate();

%>

<a href="select.jsp">결과보기</a>

<%
response.sendRedirect("select.jsp"); 
%>

</body>
</html>