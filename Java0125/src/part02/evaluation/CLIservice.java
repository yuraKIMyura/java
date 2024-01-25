//10 시험용
package part02.evaluation;

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
				System.out.println("3. 데이터 수정");
				System.out.println("4. 데이터 삭제");
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

			boolean isThere = true;
			int empno = -1;
			while(isThere) {
				System.out.println("사원번호: ");
				empno = Integer.parseInt(scanner.nextLine());
				rs = stmt.executeQuery("SELECT empno FROM emp WHERE empno="+ empno);
				if(rs.next()) {
					System.out.println("이미 존재하는 사원번호입니다. 새로운 번호를 입력해주세요.");
				}else {
					isThere = false;
				}
			}
			System.out.print("사원이름:");
			String ename = scanner.nextLine();
			System.out.print("직무:");
			String job = scanner.nextLine();
			System.out.print("고용일자:");
			String hiredate = scanner.nextLine();
			System.out.print("임금:");
			double sal = Double.parseDouble(scanner.nextLine());
			System.out.print("부서번호:");
			int deptno = Integer.parseInt(scanner.nextLine());

			int result = -1;
			if(job.equalsIgnoreCase("salesman")) {
				System.out.print("커미션:");
				double comm = Double.parseDouble(scanner.nextLine());
				result = stmt.executeUpdate("INSERT INTO emp (empno, ename, job, hiredate, sal, comm, deptno) VALUES "
						+ "('" +empno + "', '"+ ename + "', '" + job + "', '" + hiredate + "', '" + sal + "', '" + comm +"', '" + deptno + "')");
			}else {
				result = stmt.executeUpdate("INSERT INTO emp (empno, ename, job, hiredate, sal, deptno) VALUES "
						+ "('" +empno + "', '"+ ename + "', '" + job + "', '" + hiredate + "', '" + sal + "', '" + deptno + "')");
			}
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
			selectQuery(column, stmt, "int");
			break;
		case "ename":
		case "job":
		case "hiredate":
		case "*":
			selectQuery(column, stmt, "string");
			break;
		case "sal":
		case "comm":
			selectQuery(column, stmt, "double");
			break;
		default:
			System.out.println("검색 조건을 확인해주세요: empno, ename, job, mgr, hiredate, sal, comm, deptno, 또는 *");
			break;	
		}
	}

	
	private static void selectQuery(String column, Statement stmt, String type) {
		
		
		ResultSet rs = null;

		try {
			stmt.getResultSet();

			if(column.equals("*")) {
				rs = stmt.executeQuery("SELECT * FROM emp ORDER BY empno");
				printResult(rs);
			}else if(column.equals("mgr")) {
				System.out.print("검색할 mgr을 입력해주세요. (부분검색 가능, NULL일 경우 ENTER 입력)");
				String input = scanner.nextLine();
				if(input.isEmpty()) {
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr IS NULL ORDER BY mgr ASC");
				}else {
					int inputInt = Integer.parseInt(input);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE mgr LIKE '%" + inputInt +"%' ORDER BY mgr ASC");
				}
				printResult(rs);
			}else if(column.equals("comm")) {
				System.out.print("검색할 comm을 입력해주세요. (부분검색 불가, NULL일 경우 ENTER 입력)");
				String input = scanner.nextLine();
				if(input.isEmpty()) {
					rs = stmt.executeQuery("SELECT * FROM emp WHERE comm IS NULL ORDER BY comm ASC");
				}else {
					double inputDouble = Double.parseDouble(input);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE comm =" + inputDouble +" ORDER BY comm ASC");
				}
				printResult(rs);			
			}else {
				System.out.println("검색할 "+column+"을 입력해주세요. (부분검색 가능)");		

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
			/**null data가 있는 column: mgr, comm **/
		} catch (SQLException e) {
			e.printStackTrace();
		}//catch

	}//method R

	
	private static void updateQuery(String column, Statement stmt, String type, int empno) {
		
		ResultSet rs = null;
		
		try {
				System.out.println("수정할 값을 입력해주세요.");
				if(type.equalsIgnoreCase("int")) {
					int input = Integer.parseInt(scanner.nextLine());
					stmt.executeUpdate("UPDATE emp SET " + column + "='"+input+"' WHERE empno="+empno);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" + empno);
					printResult(rs);
				} else if(type.equalsIgnoreCase("string")){
					String input = scanner.nextLine();
					stmt.executeUpdate("UPDATE emp SET " + column + "='"+input+"' WHERE empno="+empno);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" + empno);
					printResult(rs);					
				} else if(type.equalsIgnoreCase("double")) {
					double input = Double.parseDouble(scanner.nextLine());
					stmt.executeUpdate("UPDATE emp SET " + column + "='"+input+"' WHERE empno="+empno);
					rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" + empno);
					printResult(rs);
				}	

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateData(Connection connection) {

		Statement stmt;
		ResultSet rs;
		int empno = 999999999;

		try {
			stmt = connection.createStatement();
			System.out.print("정확한 empno를 입력해주세요: ");
			empno = Integer.parseInt(scanner.nextLine());
			rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" + empno);
			printResult(rs);
			//printResult에서 consume한 ResultSet 다시 생성하기
			rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" + empno);
			String salesman = null;
			while(rs.next()) {
				if(rs.getString("job").equalsIgnoreCase("salesman")) {
						salesman = ", comm";
				}else {
					salesman = "";
				}
			}
			System.out.println("ename, job, mgr, sal" + salesman + ", deptno 중 수정할 항목을 고르세요.");
			String column = (scanner.nextLine()).toLowerCase();
			switch(column.toLowerCase()) {
			case "ename": case "job":
				updateQuery(column, stmt, "string", empno);
				break;
			case "mgr":
				updateQuery(column, stmt, "int", empno);
				break;
			case "sal": case "comm":
				updateQuery(column, stmt, "double", empno);
				break;
			default:
				break;
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
			System.out.print("삭제할 사원번호를 정확히 입력해주세요.");
			int empno = Integer.parseInt(scanner.nextLine());
			rs = stmt.executeQuery("SELECT * FROM emp WHERE empno=" +empno);
			printResult(rs);
			System.out.println("사원번호 "+empno+"에 대한 정보를 정말로 삭제하시겠습니까? (Y/N) ");
			String response = scanner.nextLine();
			
			if(response.equalsIgnoreCase("y")) {
				int result = stmt.executeUpdate("DELETE FROM emp WHERE empno="+empno);
				if(result>=1) {
					System.out.println("삭제에 성공했습니다.");
				} else {
					System.out.println("삭제에 실패했습니다");
				}
			}else if(response.equalsIgnoreCase("n")) {
				System.out.println("삭제를 취소합니다.");
			}else {
				System.out.println("부정확한 입력입니다.");
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}//method D

}//class
