package dao;

import java.sql.*;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
	
	private static Connection conn;

	/**1.DAO 객체 생성: Singleton Pattern 사용**/
	private static BoardDao dao = new BoardDao();
	private BoardDao() {};
	//DAO 객체 생성할 때 DB 접속을 해버림
	public static BoardDao getInstance() {
		BoardDao.getConnection();
		//호출만 한 번 해주는 코드
		//이 method를 호출 안 하면 null임
		return dao;
	}
	
	/**2.DAO에서 DB 접속: 
	 * DB에 접속하는 method를 정의하고,
	 * 이 method를 DAO 객체생성자에 포함시켜서 DB접속은 단 한번만 하도록.
	**/
	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	//지역변수일 때 return의 의미가 있음. 그런데 static으로 전역변수가 됨. 그래서 굳이 할 필요 없음. 
	
	/**3.DAO에서 DB 관련 자료 반환:
	 * DAO에서 DB와 상호작용하는 method를 정의,
	 * 여기에서 나온 결과물을 반환만 함.**/
	//1. 전체 게시물
	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<>();
		String sql = "SELECT * FROM board ORDER BY num DESC";
		//원래는 conn.prepareStatment(sql)였으니까 아래처럼 작성
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"), rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;		
	}
	
	//2. 특정 게시물 불러오기
	public Board selectOne(int num, boolean increase) {
		String sql = "SELECT * FROM board WHERE num = ?";
		String updateSql = "UPDATE board SET hits = hits + 1 WHERE num = ?";
		Board board = null;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs!=null && rs.next()) {
				
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"), rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));

			}
			
			if(increase) {
				PreparedStatement updateStmt = conn.prepareStatement(updateSql);
		        updateStmt.setInt(1, num);
		        updateStmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(board);
		return board;
	}
	
	//3. 특정 게시물 삭제하기
	public int delete(int num) {
		int result = -9999;
		String sql = "DELETE FROM board WHERE num = ?";
		
		try( 
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setInt(1,  num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//4. 게시물 작성하기
	public int insert(Board board) {
		System.out.println("BoardDAO :" + board);
		int result = -9999;
		String sql = "INSERT INTO board (title, writer, content, regtime, hits) VALUES (?, ?, ?, ?, 0)";
		try( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setString(1, board.getTitle());
				pstmt.setString(2, board.getWriter());
				pstmt.setString(3, board.getContent());
				pstmt.setString(4, board.getRegtime());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
	}
	
	//5. 게시물 수정하기
	public int update(Board board) {
		int result = -9999;
		String sql = "UPDATE board SET title = ?, writer = ?, content = ? WHERE num = ?";
		
		try( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setString(1, board.getTitle());
				pstmt.setString(2, board.getWriter());
				pstmt.setString(3, board.getContent());
				pstmt.setInt(4, board.getNum());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
	}
	
	
}//class
