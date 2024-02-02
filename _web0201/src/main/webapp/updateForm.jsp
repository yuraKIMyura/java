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

<%
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "SELECT ename, job, sal FROM emp1 WHERE ename=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("ename"));
ResultSet rs = pstmt.executeQuery();

rs.next();
%>


	<a href="index.jsp">목록으로</a> </br>

	<form action="update.jsp" method="post">
	
		<label>이름</label> <input type="text" name="ename" value=<%=rs.getString("ename")%>> </br>
		<label>직무</label> <input type="text" name="job" value=<%=rs.getString("job")%>> </br>
		<label>급여</lable> <input type="text" name="sal" value=<%=rs.getDouble("sal")%>> </br>
		
		<input type="submit" value="수정">
		<input type="reset" value="취소">
		
	</form>

</body>
</html>