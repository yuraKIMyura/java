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
String sql = "UPDATE emp1 SET job = ? , sal = ? WHERE ename = ? ";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1,request.getParameter("job"));
pstmt.setDouble(2,Double.parseDouble(request.getParameter("sal")));
pstmt.setString(3,request.getParameter("ename"));

pstmt.executeUpdate();

%>

<a href="select.jsp">결과보기</a>

수정 완료

</body>
</html>