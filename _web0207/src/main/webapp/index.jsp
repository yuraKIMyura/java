<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String numU="";
	String nameU="";
	String korU="";
	String engU="";
	String mathU="";
	
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score where num = "+request.getParameter("num")+" order by num");
    		 
    ) {
        if (rs.next()) {
        	numU = rs.getString("num");
        	nameU = rs.getString("name");
            korU = rs.getString("kor");
            engU = rs.getString("eng"); 
            mathU = rs.getString("math");
        }        
    } catch(Exception e) {
    e.printStackTrace();
}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>one-page</title>
	<style>
        table { width: 400px; text-align: center; }
        th    { background-color: cyan; }
	</style>

</head>
<body>

<form method="post" id="frm">
<label>번호</label> <input type="text" name="num" value=<%=numU%>> <br/>
<label>이름</label> <input type="text" name="name"  value=<%=nameU%>> <br/>
<label>국어</label> <input type="text" name="kor"  value=<%=korU%>> <br/>
<label>영어</label> <input type="text" name="eng"  value=<%=engU%>> <br/>
<label>수학</label> <input type="text" name="math"  value=<%=mathU%>> <br/>
</form>

<button onClick="insert()">입력</button>
<button onClick="update()">수정</button>
<button onClick="reset()">취소</button>


<table>
    <tr>
        <th>번호</th>
        <th>이름</th>
        <th>국어</th>
        <th>영어</th>
        <th>수학</th>
        <th>총점</th>
        <th>평균</th>
        <th>삭제</th>
    </tr>
<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score order by num");
    ) {
        while (rs.next()) {
        	int num = rs.getInt("num");
        	String name = rs.getString("name");
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>          
            <tr>
                <td><%=num %></td>
                <td><a href="index.jsp?num=<%=num %>"><%=name %></a></td>
                <td><%=rs.getInt   ("kor" )%></td>
                <td><%=rs.getInt   ("eng" )%></td>
                <td><%=rs.getInt   ("math")%></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
                <td><a href="index.jsp?num=<%=num %>">삭제</a></td>
            </tr>
<%          
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</table>


<script>
function insert(){
	document.getElementById('frm').action='insert.jsp';
	document.getElementById('frm').submit();	
}

function update(){
	document.getElementById('frm').action='update.jsp';
	document.getElementById('frm').submit();	
}

function reset(){
	document.getElementById('frm').action='reset.jsp';
	document.getElementById('frm').submit();	
}
</script>

</body>
</html>