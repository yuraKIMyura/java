<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가</title>
</head>
<body>

<%
	
	request.setCharacterEncoding("UTF-8");
	
    Class.forName("oracle.jdbc.driver.OracleDriver");
    ResultSet rs = null;
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM score WHERE num = ?");
  	) {
    	pstmt.setInt(1,Integer.parseInt(request.getParameter("num")));
    	rs = pstmt.executeQuery();
       	rs.next();
       	
%>

       	<form action="update.jsp" method="post">

       		<table>
       			<tr> 
       				<td>번호</td>
       				<td><input type="text" name="num" value=<%=rs.getInt("num")%>>
       			</tr>
       			
       			<tr> 
       				<td>이름</td>
       				<td><input type="text" name="name"  value=<%=rs.getString("name")%>>
       			</tr>
       			
       			<tr> 
       				<td>국어</td>
       				<td><input type="text" name="kor"  value=<%=rs.getDouble("kor")%>>
       			</tr>
       			
       			<tr> 
       				<td>영어</td>
       				<td><input type="text" name="eng"  value=<%=rs.getDouble("eng")%>>
       			</tr>
       			
       			<tr> 
       				<td>수학</td>
       				<td><input type="text" name="math" value=<%=rs.getDouble("math")%>>
       			</tr>
       			
       			<tr>
       				<td> <button type="submit">수정</button></td>
       				<td> <button type="reset">취소</button></td>
       			</tr>
       		
       		</table>
       	</form>       	

<%       	
    } catch (Exception e){
    	e.printStackTrace();
    }
%>

</body>
</html>