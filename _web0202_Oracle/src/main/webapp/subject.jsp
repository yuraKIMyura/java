<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목별 성적</title>
    <style>
        table { width: 400px; text-align: center; border-radius:100px}
        th    { background-color: #3652AD; color: white}
        tr	  { background-color: #E9F6FF;}
        button#nav { background-color:#FE7A36; color:white; width:100px; height:30px;}
        button { background-color: #280274; border: none; color:white; border-radius:2px}
    </style>     
</head>
<body>


<button id="nav" onClick="location.href='index.jsp'">메인 페이지</button>
<button id="nav" onClick="location.href='list.jsp'">학생 목록</button>
<br/>
<br/>


<%
request.setCharacterEncoding("UTF-8");

Class.forName("oracle.jdbc.driver.OracleDriver");
try ( 
    Connection conn = DriverManager.getConnection(
    		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    PreparedStatement pstmt_max = conn.prepareStatement("SELECT MAX(kor), MAX(eng), MAX(math) FROM score");
    ResultSet rs_max = pstmt_max.executeQuery();
	PreparedStatement pstmt_min = conn.prepareStatement("SELECT MIN(kor), MIN(eng), MIN(math) FROM score");
	ResultSet rs_min = pstmt_min.executeQuery();
	PreparedStatement pstmt_avg = conn.prepareStatement("SELECT ROUND(AVG(kor),2), ROUND(AVG(eng),2), ROUND(AVG(math),2) FROM score");
	ResultSet rs_avg = pstmt_avg.executeQuery();	
	
){	
	rs_max.next();
	rs_min.next();
	rs_avg.next();
%>

	<table>
		<tr>
			<th></th>
			<th>국어</th>			
			<th>영어</th>
			<th>수학</th>			
		</tr>
			<tr>
				<th>최고점수</th>
				<td><%=rs_max.getDouble(1) %>점</td>			
				<td><%=rs_max.getDouble(2) %>점</td>
				<td><%=rs_max.getDouble(3) %>점</td>			
			</tr>

		<tr>
			<th>최저점수</th>
			<td><%=rs_min.getDouble(1) %>점</td>			
			<td><%=rs_min.getDouble(2) %>점</td>
			<td><%=rs_min.getDouble(3) %>점</td>			
		</tr>			
		<tr>
			<th>평균점수</th>
			<td><%=rs_avg.getDouble(1) %>점</td>			
			<td><%=rs_avg.getDouble(2) %>점</td>
			<td><%=rs_avg.getDouble(3) %>점</td>			
		</tr>
	</table>	

<%	
}catch(Exception e){
	
}

%>


</body>
</html>