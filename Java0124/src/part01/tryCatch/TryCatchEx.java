//1 Try-Catch-Finally syntax, throws difference, multiple catch
package part01.tryCatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) /*throws ClassNotFoundException*/ {
		
//1.던지기는 프로그램 중단되버림
//2.try-catch는 오류 제어하는 역할임
		
		
/**던지기 throws**/
		//Class.forName("String");
		
/**try-catch statement**/
		try {
			//"" 안의 class file이 memory에서 실행가능한지를 묻는 code
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e1) {
			System.out.println("오류 발생");
			//실제 오류 발생 시와 동일한 메시지 내용 보여주기 (개발 시의 오류 파악 위함)
			System.out.println("* ClassNotFoundException");
			e1.printStackTrace();
		} finally {
			System.out.println("반드시 종료");
			System.exit(0);
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			System.out.println("* SQLException");
			e.printStackTrace();
		}
		
		
	}

}
