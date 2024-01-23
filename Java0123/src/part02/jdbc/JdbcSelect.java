//4 JDBC select
package part02.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM emp";

		//여기서부터 Insert, Delete, Update와 달라짐
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.print(rs.getRow()+ " ");
			System.out.print(rs.getInt("empno")+ " ");
			System.out.print(rs.getString("ename")+ " ");
			System.out.print(rs.getDouble("sal")+ " \n");
		}
	}

}
