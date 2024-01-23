//4 JDBC select
package part02.jdbc;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelect {
	
	static List<Employee> list = new ArrayList<Employee>();

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
			list.add(new Employee(rs.getInt("empno"), rs.getString("ename"), rs.getDouble("sal")));
		}
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
