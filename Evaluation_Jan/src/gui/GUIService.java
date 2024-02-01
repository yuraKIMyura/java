package gui;

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

public class GUIService extends JFrame {
	
	//1.이벤트 처리를 위해 component(button, textarea, textfield)를 field로 설정
	JButton bt1 = new JButton("전체내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	
	//괄호 안 숫자 의미: (row, column)
	JTextArea ta = new JTextArea(10,60);
	
	//괄호 안 숫자 의미: 너비
	JTextField tf1 = new JTextField(3);
	JTextField tf2 = new JTextField(3);
	JTextField tf3 = new JTextField(3);
	JTextField tf4 = new JTextField(3);
	JTextField tf5 = new JTextField(3);
	JTextField tf6 = new JTextField(3);
	JTextField tf7 = new JTextField(3);
	JTextField tf8 = new JTextField(3);
	
	JLabel lbResult = new JLabel();
	
	//4.DB 사용을 위해 Connection, Statement field로 설정
	Connection conn;
	Statement stmt;


	
	//constructor: DB연결, 화면구성
	public GUIService() {
		
		//3.DB연결: Exception Handling, Resource Close
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
		
		this.setTitle("emp 관리");
		this.setLocation(500, 400);
		this.setSize(800, 300);
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		
		//2.Panel에 FlowLayout 설정: 화면 좌측부터 배치!
		
		//화면 최하단
		//South Panel: Button Component
		JPanel jp1 = new JPanel(new FlowLayout());
		con.add(jp1, BorderLayout.SOUTH);
		jp1.add(lbResult);
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
		
		JLabel lb1 = new JLabel("사원번호");
		JLabel lb2 = new JLabel("사원명");
		JLabel lb3 = new JLabel("직무");
		JLabel lb4 = new JLabel("매니저번호");
		JLabel lb5 = new JLabel("고용일");
		JLabel lb6 = new JLabel("임금");
		JLabel lb7 = new JLabel("커미션");
		JLabel lb8 = new JLabel("부서번호");
		
		
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
		jp3.add(lb6);
		jp3.add(tf6);
		jp3.add(lb7);
		jp3.add(tf7);
		jp3.add(lb8);
		jp3.add(tf8);
		
		
		//5.Event 설정을 위해 익명의 구현객체 생성
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
		
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				searchName();
			}	
		});		
		
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update();
			}	
		});
		
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
			}	
		});
		
	}//constructor



	
	
/**Query 관련 method**/	

	
	/**CREATE**/
	public void insert() {
		lbResult.setText("");
		String sql = String.format("INSERT INTO emp VALUES (%d, '%s', '%s', %d, '%s', %.2f, %.2f, %d)",
				Integer.parseInt(tf1.getText()), tf2.getText(), tf3.getText(), Integer.parseInt(tf4.getText()), tf5.getText(), Double.parseDouble(tf6.getText()), Double.parseDouble(tf7.getText()), Integer.parseInt(tf8.getText()));
		int result=-1;
		try {
			result = stmt.executeUpdate(sql);
			clearTextField();
			select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		lbResult.setText("총 "+result+"개의 자료 입력 성공");
	}//method
	
	
	/**READ**/
	//SELECT ALL
	public void select() {
		clearTextField();
		lbResult.setText("");
		String sql = "SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp ORDER BY empno ASC";
		/**Query 결과 중복 showing 방지**/
		ta.setText("");
		try {
			ResultSet rs = stmt.executeQuery(sql);
			int recordCount = 0;
			while(rs.next()) {
				recordCount++;
				int no = rs.getRow();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");				
				
				String str = String.format("[%02d]  %d,   %s,   %s,   %d,   %s,   %.2f,   %.2f,   %d\n",
						no, empno, ename, job, mgr, hiredate, sal, comm, deptno);
				
				/**Query 결과를 화면에 출력**/
				ta.append(str);
				lbResult.setText("총 "+recordCount+"개의 자료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//method
	
	
	//SELECT with EMPNO (for DELETE)
	public void select(int empno) {
		String sql = "SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp WHERE empno ="+empno;
		ta.setText("");
		try {
			ResultSet rs = stmt.executeQuery(sql);
			int recordCount = 0;
			while(rs.next()) {
				recordCount++;
				int no = rs.getRow();
				empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");				
				
				String str = String.format("[%02d]  %d,   %s,   %s,   %d,   %s,   %.2f,   %.2f,   %d\n",
						no, empno, ename, job, mgr, hiredate, sal, comm, deptno);
				
				/**Query 결과를 화면에 출력**/
				ta.append(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//method
	
	
	//SELECT with ENAME
	public void searchName() {
		lbResult.setText("");
		String sql = String.format("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp WHERE ename='%s'", tf2.getText());
		ta.setText("");
		try {
			ResultSet rs = stmt.executeQuery(sql);
			int recordCount = 0;
			while(rs.next()) {
				recordCount++;
				int no = rs.getRow();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");				
				
				String str = String.format("[%02d]  %d,   %s,   %s,   %d,   %s,   %.2f,   %.2f,   %d\n",
						no, empno, ename, job, mgr, hiredate, sal, comm, deptno);
				
					/**Query 결과를 화면에 출력**/
					ta.append(str);	
					
					tf1.setText(String.valueOf(empno));
					tf3.setText(job);
					tf4.setText(String.valueOf(mgr));
					tf5.setText(hiredate);
					tf6.setText(String.valueOf(sal));
					tf7.setText(String.valueOf(comm));
					tf8.setText(String.valueOf(deptno));
					
					lbResult.setText("총 "+recordCount+"개의 자료 검색 완료. \n[현재 상태에서 수정 및 삭제 가능]");
					
					}
			
			if(recordCount==0) ta.setText("해당 사원명의 검색결과가 없습니다");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//method
	
	
	/**UPDATE**/	
	public void update() {
		lbResult.setText("");
		int no=99999;
		String sql = String.format("UPDATE emp SET ename='%s', job='%s', mgr=%s, hiredate='%s', sal=%s, comm=%s, deptno=%s WHERE empno=%s"
				, tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf1.getText());
		int result=-1;
		no=Integer.parseInt(tf1.getText());
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		clearTextField();
		if(result>=1) {
			select(no);
			lbResult.setText("총 "+result+"개의 자료 수정 완료.");
		}else {
			ta.setText("");
			lbResult.setText("자료 수정에 실패했습니다");
		}
	}//method
	
	
	/**DELETE**/	
	public void delete() {
		lbResult.setText("");
		String sql = String.format("DELETE FROM emp WHERE empno=%s AND ename='%s'", tf1.getText(), tf2.getText());
		int result=-1;
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		clearTextField();

		if(result >= 1) {
			ta.setText("[삭제 성공]");
			lbResult.setText("총 "+result+"개의 자료 삭제 완료.");
		}else {
			ta.setText("[삭제 실패]");
			lbResult.setText("삭제에 실패했습니다.");
		}
	}//method
	
	
	/**miscellaneous**/
	private void clearTextField() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");	
	}//method
	
	
	
	
	
	public static void main(String[] args) {
		new GUIService();
	}//main


	
}//class
