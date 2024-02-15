<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>

<%
	request.setCharacterEncoding("utf-8");

	String num = request.getParameter("num");
	String writer = request.getParameter("writer");
	
	boolean isLoggedIn = false;
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(
			Connection conn = DriverManager.getConnection(
	        		"jdbc:mysql://localhost:3306/project1", "root", "mysql");
	        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM board WHERE num = ? AND writer = ?");
	){
		pstmt.setString(1, num);
		pstmt.setString(2, writer);

		try(ResultSet rs = pstmt.executeQuery()) {	
			rs.next();
			if(rs.getInt(1)==1){
				isLoggedIn = true;
			}
		} catch(Exception e){
				e.printStackTrace();
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	if(isLoggedIn) {
		session.setAttribute("MEMBERID", num);
		response.sendRedirect("list.jsp");
%>
		<html>
		<head><title>로그인성공</title></head>
		<body>
		
		로그인에 성공했습니다.
		
		</body>
	</html>
<%
	} else { // 로그인 실패시
%>
		<script>
		alert("로그인에 실패하였습니다.");
		history.go(-1);
		</script>
<%
	}
%>
