//3 오류 안 나게 만들기: jar 넣고, getConnection 설정 완료하라는 말이었음
//4 ArrayList에 추가하기

package part01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcArrayEx {

	public static void main(String[] args) {
		
		List<Dept> list = new ArrayList<Dept>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		
		Connection conn = null;
		Statement stmt = null;
		
		String sql = "SELECT deptno, dname, loc FROM dept";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
			stmt.getResultSet();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				/**번호에 해당하는 column을 돌려주는 역할**/
				/**Data type 맞춰줘야하는 건 동일하다**/
				//System.out.print(rs.getInt(1)+ " ");
				//System.out.print(rs.getString(2)+ " ");
				//System.out.print(rs.getString(3)+ " \n");
				
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				list.add(new Dept(deptno, dname, loc));
			
			}//while
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
		for(Dept d : list) {
			System.out.println(d);
			//항목별로 만들기
			System.out.println(d.getDeptno());
		}
		
	}//main

}//class
