//try-catch-finally
package part02.tryWResources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class1 {

	void method() {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "SELECT * FROM emp";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, id, pass);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			st.getResultSet();
			
			while(rs.next()) {
				System.out.print(rs.getInt("empno") + " ");
				System.out.print(rs.getString("ename") + " ");
				System.out.print(rs.getDouble("sal") + "\n");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)
				try {
					rs.close();
				}catch (Exception e) {
					
				}
			if(st!=null)
				try {
					st.close();
				}catch (Exception e) {
					
				}
			if(con!=null)
				try {
					con.close();
				}catch (Exception e) {
					
				}
		}//finally
		
	}//method
	
	
	public static void main(String[] args) {
		
		
		
	}//main

}
