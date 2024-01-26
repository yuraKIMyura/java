//[5교시] 오후 첫수업
//1 swing...
package evaluation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinDept extends JFrame {
	
	/**1.이벤트 처리를 위해 component(button, textarea, textfield)를 field로 설정**/
	JButton bt1 = new JButton("전체내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	
	//괄호 안 숫자 의미: (row, column)
	JTextArea ta = new JTextArea(10,40);
	
	//괄호 안 숫자 의미: 너비
	JTextField tf1 = new JTextField(3);
	JTextField tf2 = new JTextField(3);
	JTextField tf3 = new JTextField(3);
	JTextField tf4 = new JTextField(3);
	JTextField tf5 = new JTextField(3);
	
	/**4.DB 사용을 위해 Connection, Statement field로 설정**/
	Connection conn;
	Statement stmt;


	
	//constructor: DB연결, 화면구성
	public WinDept() {
		
		/**3.DB연결: Exception Handling, Resource Close**/
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		
		try {
			//JDBC Driver loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.setTitle("DEPT관리");
		this.setLocation(500, 400);
		this.setSize(500, 300);
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		//연습을 위한 코드
		//con.add(bt1, BorderLayout.EAST);
		//con.add(bt2, BorderLayout.WEST);
		//con.add(bt3, BorderLayout.SOUTH);
		//con.add(bt4, BorderLayout.NORTH);
		//con.add(bt5, BorderLayout.CENTER);
		
		/**2.Panel에 FlowLayout 설정: 화면 좌측부터 배치!**/
		
		//화면 최하단
		//South Panel: Button Component
		JPanel jp1 = new JPanel(new FlowLayout());
		con.add(jp1, BorderLayout.SOUTH);
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		
		//화면 중부
		//Center Panel: TextArea Component
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		con.add(jp2, BorderLayout.CENTER);
		jp2.add(scroll);
		
		JLabel lb1 = new JLabel("부서코드: ");
		JLabel lb2 = new JLabel("부서명: ");
		JLabel lb3 = new JLabel("부서위치: ");
		JLabel lb4 = new JLabel("요소4");
		JLabel lb5 = new JLabel("요소5");
		
		//화면 최상단
		//Top Panel: Label+TextField Component
		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);
		jp3.add(tf1);
		jp3.add(lb2);
		jp3.add(tf2);
		jp3.add(lb3);
		jp3.add(tf3);
		jp3.add(lb4);
		jp3.add(tf4);
		jp3.add(lb5);
		jp3.add(tf5);
		
		/**5.Event 설정을 위해 익명의 구현객체 생성**/
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				select();
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insert();
			}
		});
		
	}//constructor


	
/**Query 관련 method**/	
	//SELECT METHOD
	public void select() {
		String sql = "SELECT deptno, dname, loc FROM dept";
		/**Query 결과 중복 showing 방지**/
		ta.setText("");
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = String.format("%d, %s, %s\n", deptno, dname, loc);
				
				/**Query 결과를 화면에 출력**/
				ta.append(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//SELECT METHOD
	public void insert() {
		String sql = String.format("INSERT INTO dept VALUES (%d, '%s', '%s')",
				(int) Integer.parseInt(tf1.getText()), tf2.getText(), tf3.getText());
		//[선생님 의견] ''가 있으면 DB에서 String으로 인식, ''가 없으면 int로 인식하기 때문에 Parsing은 따로 필요 없다.
		//[GPT와 나의 의견] LIKE도 숫자에서 돌아가는데 쓰지 말라 그랬으면서.. 이것도 쓰면 안 되지! type 맞춰줘서 가능한 에러를 없애겠다!
	
		try {
			System.out.println(sql);
			int res = stmt.executeUpdate(sql);
			clearTextField();
			select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void clearTextField() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
	}
	
	
	public static void main(String[] args) {
		new WinDept();
	}//main




	
}//class
