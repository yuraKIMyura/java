<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String id= request.getParameter("id");
	String pw = request.getParameter("pw");
	boolean isLoggedIn = false;

	Class.forName("oracle.jdbc.driver.OracleDriver");
	String sql = "SELECT COUNT(*) FROM score WHERE num = ? AND name = ?";
	try ( 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(sql);
	) {		
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		if(rs.getInt(1) == 1){
			System.out.println("로그인 성공");
			isLoggedIn = true;
		} else{
			System.out.println("로그인 실패");
			isLoggedIn = false;
		}
		
    } catch(Exception e) {
    	e.printStackTrace();
	}

     if (isLoggedIn) {
        Cookie cookie = new Cookie("userId", id);
        cookie.setMaxAge(-1);         // 웹 브라우저가 닫힐 때 쿠키 만료됨
        response.addCookie(cookie);
        
        response.sendRedirect("loginCheck.jsp");   // 로그인 메인 화면으로 돌아감
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>
 
</body>
</html>