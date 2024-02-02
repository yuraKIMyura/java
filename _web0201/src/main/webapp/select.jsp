<%@page import="java.sql.ResultSet"%>
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

	<a href="index.jsp">목록으로</a> </br>

<%
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "SELECT ename, job, sal FROM emp1";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();%>

	<table border="1">
	<%
	while(rs.next()){ %>
	
			<tr>
				<td><a href="updateForm.jsp?ename=<%=rs.getString("ename")%>"> <%=rs.getString("ename") %> </a> </td>
				<td><%=rs.getString("job") %></td>
				<td><%= rs.getDouble("sal") %></td>
				<td><button onClick="location.href='delete.jsp?ename=<%=rs.getString("ename")%>'">삭제</button></td>
			</tr>	
	
	<%} %>
	</table>
</body>
</html>