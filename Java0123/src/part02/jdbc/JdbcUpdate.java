//3 JDBC update
package part02.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "update emp set sal = 15000 where empno = 7777";
		//select query 외에는 다 update
		//성공한 '행'의 수가 return 됨
		int result = stmt.executeUpdate(sql);
		if(result >= 1) {
			System.out.println("update 성공 "+result);
		}else {
			System.out.println("update 실패 "+result);
		}
	}

}
