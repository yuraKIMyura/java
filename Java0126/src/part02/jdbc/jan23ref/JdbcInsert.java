//1 JDBC insert
package part02.jdbc.jan23ref;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "insert into emp values(7777, '김하나', '사원', 7839, '2024-01-23', 3000, null, 10)";
		//select query 외에는 다 update
		//성공한 '행'의 수가 return 됨
		int result = stmt.executeUpdate(sql);
		if(result >= 1) {
			System.out.println("insert 성공 " + result);
		}else {
			System.out.println("insert 실패 " + result);
		}
	}

}
