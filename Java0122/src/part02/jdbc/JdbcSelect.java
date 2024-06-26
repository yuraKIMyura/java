//1 java-jdbc 연동
//웹개발 시에는 configuration file에 정보를 다 넣을 거임! 그래도 원리는 알아둬
package part02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	/**Loading the JDBC Driver**/	
		//.forName(): dynamically load and link the class specified by the argument, which is a fully qualified class name (including the package name).
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("MySQL JDBC 드라이버 로딩");

	/**Establishing a Database Connection**/		
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass = "mysql";
		//Connection is an interface in the java.sql package that represents a connection to a database.
		//DriverManager is a class in the java.sql package that manages a list of database drivers. It is used to establish a connection to a database by selecting an appropriate driver from the registered JDBC drivers.
		//getConnection() method is a static method of the DriverManager class. It is used to establish a connection to a database.
		Connection conn = DriverManager.getConnection(url, id, pass);
		System.out.println("MySQL 연결 성공");
		

	/**JDBC Database Query Example**/		
		//Statement is an interface provided by the java.sql package that allows you to execute SQL queries against a database. 
		Statement stmt = conn.createStatement();
		//ResultSet represents the result set of a database query.
		ResultSet rs = stmt.executeQuery("SELECT * FROM dept");
		//next() method is a part of the ResultSet interface in Java's JDBC (Java Database Connectivity) API. 
		//It is used to move the cursor to the next row in the result set and returns a boolean value indicating whether there is a next row or not.
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s\n", deptno, dname, loc);
		}
		rs.close();
		
		
		
		
		conn.close();
	}

}
