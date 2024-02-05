<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="./css/style.css">
    <meta charset="UTF-8">
    <title>학생 목록</title>
</head>
<body>

<button id="nav" onClick="location.href='index.jsp'">메인 페이지</button>
<button id="nav" onClick="location.href='subject.jsp'">과목별 점수</button>
<br/>
<br/>

<table>

    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
    
<%

	request.setCharacterEncoding("UTF-8");
	
	boolean isError = false;
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM score ORDER BY num ASC");
        ResultSet rs = pstmt.executeQuery();

   		PreparedStatement pstmt_avg_sub = conn.prepareStatement("SELECT ROUND(AVG(kor),2), ROUND(AVG(eng),2), ROUND(AVG(math),2) FROM score");
   		ResultSet rs_avg_sub = pstmt_avg_sub.executeQuery();

   		PreparedStatement pstmt_max = conn.prepareStatement("SELECT MAX(kor), MAX(eng), MAX(math) FROM score");
       	ResultSet rs_max = pstmt_max.executeQuery();
        	
      	PreparedStatement pstmt_min = conn.prepareStatement("SELECT MIN(kor), MIN(eng), MIN(math) FROM score");
       	ResultSet rs_min = pstmt_min.executeQuery();

   		PreparedStatement pstmt_total_indi = conn.prepareStatement("SELECT MAX(kor+eng+math) AS max_indi, MIN(kor+eng+math) AS min_indi, ROUND(AVG(kor+eng+math) ,2)AS avg_indi FROM score");
   		ResultSet rs_total_indi = pstmt_total_indi.executeQuery();	
    		
       	PreparedStatement pstmt_avg_indi = conn.prepareStatement("SELECT MAX(ROUND((kor+eng+math)/3,2)) AS max_indi, MIN(ROUND((kor+eng+math)/3,2)) AS min_indi, ROUND(AVG((kor+eng+math)/3),2) AS avg_indi FROM score");
       	ResultSet rs_avg_indi = pstmt_avg_indi.executeQuery();	   			

    		    		
    ) {
        while (rs.next()) {
            double sum = rs.getDouble("kor") + rs.getDouble("eng") + 
                      rs.getDouble("math");
%>          
	<tr>
                <td><%=rs.getInt   ("num" )%></td>
                <td><%=rs.getString("name")%></td>
                <td><%=rs.getDouble   ("kor" )%></td>
                <td><%=rs.getDouble   ("eng" )%></td>
                <td><%=rs.getDouble   ("math")%></td>
                <td><%=String.format("%.2f",sum)%></td>
                <td><%=String.format("%.2f", (double)sum / 3)%></td>
                <td> <button onClick="location.href='delete.jsp?num=<%=rs.getInt("num")%>'">삭제</button> </td>
                <td> <button onClick="location.href='updateForm.jsp?num=<%=rs.getInt("num")%>'">수정</button> </td>        
	</tr>
<%          
        }
     rs_avg_sub.next();
     rs_max.next();
     rs_min.next();
     rs_total_indi.next();
     rs_avg_indi.next();

 %>

	<tr>
		<th>평균</th>
		<th>-</th>
		<th><%=rs_avg_sub.getDouble(1) %></th>
		<th><%=rs_avg_sub.getDouble(2) %></th>
		<th><%=rs_avg_sub.getDouble(3) %></th>
		<th><%=rs_total_indi.getDouble("avg_indi")%></th>
		<th><%=rs_avg_indi.getDouble("avg_indi")%></th>
	</tr>
	<tr>
		<th>최고</th>
		<th>-</th>
		<th><%=rs_max.getDouble(1) %></th>
		<th><%=rs_max.getDouble(2) %></th>
		<th><%=rs_max.getDouble(3) %></th>
		<th><%=rs_total_indi.getDouble("max_indi")%></th>
		<th><%=rs_avg_indi.getDouble("max_indi")%></th>
	</tr>
	<tr>
		<th>최저</th>
		<th>-</th>
		<th><%=rs_min.getDouble(1) %></th>
		<th><%=rs_min.getDouble(2) %></th>
		<th><%=rs_min.getDouble(3) %></th>
		<th><%=rs_total_indi.getDouble("min_indi")%></th>
		<th><%=rs_avg_indi.getDouble("min_indi")%></th>
	</tr>

<%      
    } catch(SQLException e) {
        isError = true;
    }
%>
				   

	</table>


	<br/>
	
	<button id="nav" onClick="location.href='inputForm.jsp'">학생추가</button>
	<%
		String exceptionType = request.getParameter("exceptionType");
		String message ="";
		int style=-1;
		if(exceptionType!=null){
			switch(exceptionType){
			case"1": 
				message = "입력에 실패했습니다. 중복된 번호인지 확인해주세요.";
				style = 1;
				break;
			case"2":
				message = "삭제에 실패했습니다.";
				style = 1;
				break;
			case"3":
				message = "수정에 실패했습니다.";
				style=1;
				break;
			case"0":
				message ="처리가 성공적으로 이루어졌습니다.";
				style = 0;
				break;
			}
		}	
	
	switch(style) { 
	case 1: %>
	<strong style="color: darkred;"><%out.print(message);%></strong>
    <% 
    break;
	case 0: %>
	<strong style="color: darkslategrey;"><%out.print(message);%></strong>
	<%
	break;
    } %>        
            
    

</body>
</html>