package part2.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowDesign extends JFrame {

	static final int WIDTH_L = 50;
	static final int WIDTH_TF = 80;
	static final int WIDTH_BTN = 120;
	static final int HEIGHT = 20;
	
	static final int ROOM = 5;
	static final int GAP = 30; 
	static final int GAP_BTN = 60;
	
	public WindowDesign() {
		
		Container con = this.getContentPane();
		con.setLayout(null);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1050,370);
		
		int x = 20;
		int y1 = 20;
		
		int groupTotal = WIDTH_L+ROOM;
		int total = WIDTH_L+ROOM+WIDTH_TF+GAP;
		
		JLabel name1 = new JLabel("이름");
		name1.setLocation(x, y1);
		name1.setSize(WIDTH_L-20, HEIGHT);
		con.add(name1);
		
		JTextField name2 = new JTextField();
		name2.setLocation(x+groupTotal, y1);
		name2.setSize(WIDTH_TF, HEIGHT);
		con.add(name2);
		
		
		int xID = x+total;
		
		JLabel id1 = new JLabel("아이디");
		id1.setLocation(xID, y1);
		id1.setSize(WIDTH_L-10, HEIGHT);
		con.add(id1);
		
		JTextField id2 = new JTextField();
		id2.setLocation(xID + groupTotal, y1);
		id2.setSize(WIDTH_TF, HEIGHT);
		con.add(id2);
		
	
		int xPW = xID+total;
		
		JLabel pw1 = new JLabel("패스워드");
		pw1.setLocation(xPW, y1);
		pw1.setSize(WIDTH_L, HEIGHT);
		con.add(pw1);
		
		JTextField pw2 = new JTextField();
		pw2.setLocation(xPW + groupTotal, y1);
		pw2.setSize(WIDTH_TF, HEIGHT);
		con.add(pw2);
		
		
		int xBD = xPW+total;
		
		JLabel bd1 = new JLabel("생년월일");
		bd1.setLocation(xBD, y1);
		bd1.setSize(WIDTH_L, HEIGHT);
		con.add(bd1);
		
		JTextField bd2 = new JTextField();
		bd2.setLocation(xBD + groupTotal, y1);
		bd2.setSize(WIDTH_TF, HEIGHT);
		con.add(bd2);
		
		
		int xTel = xBD+total;
		
		JLabel tel1 = new JLabel("전화번호");
		tel1.setLocation(xTel, y1);
		tel1.setSize(WIDTH_L, HEIGHT);
		con.add(tel1);
		
		JTextField tel2 = new JTextField();
		tel2.setLocation(xTel + groupTotal, y1);
		tel2.setSize(WIDTH_TF+20, HEIGHT);
		con.add(tel2);
		
		
		int xBalance = xTel+total+20;
		
		JLabel balance1 = new JLabel("잔고");
		balance1.setLocation(xBalance, y1);
		balance1.setSize(WIDTH_L, HEIGHT);
		con.add(balance1);
		
		JTextField balance2 = new JTextField();
		balance2.setLocation(xBalance + groupTotal, y1);
		balance2.setSize(WIDTH_TF, HEIGHT);
		con.add(balance2);
		
		
		JTextArea ta = new JTextArea("");
		ta.setLocation(x, y1+GAP);
		ta.setSize(980, 200);
		con.add(ta);
		
		int x2 = 80;
		int y2 = y1+GAP+200+GAP;
				
		JButton btn1 = new JButton("전체내용");
		btn1.setLocation(x2, y2);
		btn1.setSize(WIDTH_BTN, HEIGHT);
		con.add(btn1);
		
		
		int btn2x = x2+WIDTH_BTN+GAP_BTN;
		
		JButton btn2 = new JButton("입력");
		btn2.setLocation(btn2x, y2);
		btn2.setSize(WIDTH_BTN, HEIGHT);
		con.add(btn2);
		
		
		int btn3x = btn2x+WIDTH_BTN+GAP_BTN;
		
		JButton btn3 = new JButton("조회");
		btn3.setLocation(btn3x, y2);
		btn3.setSize(WIDTH_BTN, HEIGHT);
		con.add(btn3);
		
		
		int btn4x = btn3x+WIDTH_BTN+GAP_BTN;
		
		JButton btn4 = new JButton("수정");
		btn4.setLocation(btn4x, y2);
		btn4.setSize(WIDTH_BTN, HEIGHT);
		con.add(btn4);
		
		
		int btn5x = btn4x+WIDTH_BTN+GAP_BTN;
		
		JButton btn5 = new JButton("삭제");
		btn5.setLocation(btn5x, y2);
		btn5.setSize(WIDTH_BTN, HEIGHT);
		con.add(btn5);
		
		
		
	}
	
	public static void main(String args[]) {
		new WindowDesign();
	}
	
}
