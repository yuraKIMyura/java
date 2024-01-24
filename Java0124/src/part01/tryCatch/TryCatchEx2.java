//2 multiple catch (refined structure)
package part01.tryCatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class
