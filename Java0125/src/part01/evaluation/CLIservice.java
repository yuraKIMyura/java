//10 시험용
package part01.evaluation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CLIservice {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 삽입");
				System.out.println("2. 데이터 보기");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				try{
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						createData(connection);					
						break;
					case 2:
						readData(connection);
						break;
					case 3:
						updateData(connection);
						break;
					case 4:
						deleteData(connection);
						break;
					case 5:	                    
						exit = true;
						break;
					default:
						System.out.println("유효하지 않은 선택. 다시 시도하세요.");
						break;
					}

				}catch(NumberFormatException e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main


	private static void createData(Connection connection) {

		Statement stmt;
		ResultSet rs;

		try {
			stmt = connection.createStatement();
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

	}//method C




	//	private static void stringQuery(String colName, Statement stmt) {
	//		System.out.println("검색할 "+colName+"을 입력해주세요.");
	//		String input = scanner.nextLine();
	//		try {
	//			ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE " + colName + " LIKE '%" + input +"%' ORDER BY " +  colName +" ASC");
	//			printResult(rs);
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		}
	//	}//method
	//
	//	private static void intQuery(String colName, Statement stmt) {
	//		System.out.println("검색할 "+colName+"을 입력해주세요.");
	//		int input = Integer.parseInt(scanner.nextLine());
	//		try {
	//			ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE " + colName + " LIKE '%" + input +"%' ORDER BY " +  colName +" ASC");
	//			printResult(rs);
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		}
	//	}//method
	//
	//	private static void doubleQuery(String colName, Statement stmt) {
	//		System.out.println("검색할 "+colName+"을 입력해주세요.");
	//		double input = Double.parseDouble(scanner.nextLine());
	//		try {
	//			ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE " + colName + " LIKE '%" + input +"%' ORDER BY " +  colName +" ASC");
	//			printResult(rs);
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		}
	//	}//method




	private static void setColumn(String column, Statement stmt) {
		switch(column.toLowerCase()) {
		case "empno":
		case "mgr":
		case "deptno":
			generalQuery(column, stmt, "int");
			break;
		case "ename":
		case "job":
		case "hiredate":
		case "*":
			generalQuery(column, stmt, "string");
			break;
		case "sal":
		case "comm":
			generalQuery(column, stmt, "double");
			break;
		default:
			System.out.println("검색 조건을 확인해주세요: empno, ename, job, mgr, hiredate, sal, comm, deptno, 또는 *");
			break;	
		}
	}

	private static void generalQuery(String column, Statement stmt, String type) {
		
		
		ResultSet rs = null;

		try {
			stmt.getResultSet();

			if(column.equals("*")) {
				rs = stmt.executeQuery("SELECT * FROM emp");
				printResult(rs);
			}else if(column.equals("mgr")) {
				System.out.print("검색할 mgr을 입력해주세요. (NULL일 경우 ENTER 입력)");
				String input = scanner.nextLine();
				if(input.isEmpty()) {
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr IS NULL ORDER BY mgr ASC");
				}else {
					int inputInt = Integer.parseInt(input);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr LIKE '%" + inputInt +"%' ORDER BY mgr ASC");
				}
				printResult(rs);
			}else if(column.equals("comm")) {
				System.out.print("검색할 comm을 입력해주세요. (NULL일 경우 ENTER 입력)");
				String input = scanner.nextLine();
				if(input.isEmpty()) {
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr IS NULL ORDER BY mgr ASC");
				}else {
					double inputDouble = Double.parseDouble(input);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr LIKE '%" + inputDouble +"%' ORDER BY mgr ASC");
				}
				printResult(rs);			
			}else {
				System.out.println("검색할 "+column+"을 입력해주세요.");		

				if(type.equalsIgnoreCase("int")) {
					int input = Integer.parseInt(scanner.nextLine());
					rs = stmt.executeQuery("SELECT * FROM emp WHERE " + column + " LIKE '%" + input +"%' ORDER BY " +  column +" ASC");
					printResult(rs);
				} else if(type.equalsIgnoreCase("string")){
					String input = scanner.nextLine();
					rs = stmt.executeQuery("SELECT * FROM emp WHERE " + column + " LIKE '%" + input +"%' ORDER BY " +  column +" ASC");
					printResult(rs);					
				} else if(type.equalsIgnoreCase("double")) {
					double input = Double.parseDouble(scanner.nextLine());
					rs = stmt.executeQuery("SELECT * FROM emp WHERE " + column + " LIKE '%" + input +"%' ORDER BY " +  column +" ASC");
					printResult(rs);
				}	
			}	

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}//method


	private static void printResult(ResultSet rs){

		try {
			if(!rs.isBeforeFirst()) {
				System.out.println("검색 조건에 해당하는 결과가 없습니다.");
			}else {
				while(rs.next()) {
					System.out.print("["+rs.getRow() + "] ");
					System.out.print(rs.getInt("empno")+ " | ");
					System.out.print(rs.getString("ename")+ " | ");
					System.out.print(rs.getString("job")+ " | ");
					System.out.print(rs.getInt("mgr")+ " | ");
					System.out.print(rs.getString("hiredate")+ " | ");
					System.out.print(rs.getDouble("sal")+ " | ");
					System.out.print(rs.getDouble("comm")+ " | ");
					System.out.print(rs.getInt("deptno")+ "\n");
				}
			}
		} catch (SQLException e) {
			System.out.println("printResult method");
			e.printStackTrace();	
		}
	}//method

	
	private static void readData(Connection connection) {

		Statement stmt;

		try {
			stmt = connection.createStatement();
			
			System.out.println("검색 조건 입력: empno, ename, job, mgr, hiredate, sal, comm, deptno, 또는 *");
			String column = scanner.nextLine();
			setColumn(column, stmt);


			/**null data가 있는 column: mgr, comm, **/
			//			if(column.equalsIgnoreCase("mgr")) {
			//				System.out.print("검색할 mgr을 입력해주세요. (NULL일 경우 ENTER 입력)");
			//				String input = scanner.nextLine();
			//				if(input.isEmpty()) {
			//					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr IS NULL ORDER BY mgr ASC");
			//				}else {
			//					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr LIKE '%" + input +"%' ORDER BY mgr ASC");
			//				}
			//				printResult(rs);
			//			}//if


		} catch (SQLException e) {
			e.printStackTrace();
		}//catch


	}//method R


	private static void updateData(Connection connection) {

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

	}//method U


	private static void deleteData(Connection connection) {

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

	}//method D

}//class
