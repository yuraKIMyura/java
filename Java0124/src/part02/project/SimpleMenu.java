package part02.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleMenu{

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            boolean exit = false;

            while (!exit) {
                System.out.println("1. 데이터 보기");
                System.out.println("2. 데이터 삽입");
                System.out.println("3. 종료");
                System.out.print("선택하세요: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        viewData(connection);
                        break;
                    case 2:
                        insertData(connection);
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("유효하지 않은 선택. 다시 시도하세요.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewData(Connection connection) {
    	
    	Statement stmt;
    	ResultSet rs;
    	
		try {
			stmt = connection.createStatement();
			stmt.getResultSet();
			String column = scanner.nextLine();
			System.out.println("column명: deptno, dname, loc 또는 *");
			rs = stmt.executeQuery("SELECT * FROM dept");
			while(rs.next()) {
				System.out.print(rs.getInt("deptno")+ " ");
				System.out.print(rs.getString("dname")+ " ");
				System.out.print(rs.getString("loc")+ "\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    	
    	
    	

    }

    private static void insertData(Connection connection) {

    	Statement stmt;
    	ResultSet rs;
    	
		try {
			stmt = connection.createStatement();
			stmt.getResultSet();
			System.out.println("부서번호: ");
			int deptno = Integer.parseInt(scanner.nextLine());
			System.out.print("부서이름:");
			String dname = scanner.nextLine();
			System.out.print("부서위치:");
			String loc = scanner.nextLine();
			
			int result = stmt.executeUpdate("INSERT INTO dept VALUES (" +deptno + ", '"+ dname + "', '" + loc + "')");
			if(result>=1) {
				System.out.println("입력성공!");
			} else {
				System.out.println("입력실패!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
}

