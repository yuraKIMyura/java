//1 try with resources: try() 안에 선언되어 있는 자원을 자동으로 반납해주겠다.
package part02.tryWResources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class3 {

	void method() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "SELECT * FROM emp";

		try (Connection con = DriverManager.getConnection(url, id, pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				) {

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

		Class3 c = new Class3();
		c.method();

	}//main

}
