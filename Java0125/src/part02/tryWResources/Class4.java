//1 try with resources: try() 안에 선언되어 있는 자원을 자동으로 반납해주겠다.
package part02.tryWResources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class4 {

	void method() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "SELECT * FROM emp";

		Connection con = DriverManager.getConnection(url, id, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		try(con; st; rs) {

			while(rs.next()) {
				System.out.print(rs.getInt("empno") + " ");
				System.out.print(rs.getString("ename") + " ");
				System.out.print(rs.getDouble("sal") + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//method


	public static void main(String[] args) {

		Class4 c = new Class4();
		try {
			c.method();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}//main

}
