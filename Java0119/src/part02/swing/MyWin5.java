//1 swing
//(1)버튼으로 프로그램 종료하기
//(2)메시지 상자 띄우기
//(3)프로그램 시작 시에 파일 읽기, 종료 시에 파일 저장하기
//(4)상태메시지 넣기
//(5)TextArea에 내용 출력하기
package part02.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1.JFrame extends 하기
public class MyWin5 extends JFrame{
	
	JLabel jl1 = new JLabel("label1");
	JButton jb1 = new JButton("button1");	
	JTextField jtf1 = new JTextField("textfield1");
	
	JLabel jl2 = new JLabel("label2");
	JButton jb2 = new JButton("종료");	
	JTextField jtf2 = new JTextField("textfield2");
	
	JLabel jl3 = new JLabel("상태메시지");
	JTextArea jta1 = new JTextArea(20, 20);

	
	//2.constructor에서 설정하기 
	public MyWin5(){
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(750,100);
		this.setTitle("1.윈도우를 만들어 보세요.");
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		jl1.setSize(70,20);
		jb1.setSize(70,20);
		jtf1.setSize(70,20);

		jl2.setSize(70,20);
		jb2.setSize(70,20);
		jtf2.setSize(70,20);
		
		
		
		con.add(jl1);
		con.add(jb1);
		con.add(jtf1);
		
		con.add(jl2);
		con.add(jb2);
		con.add(jtf2);
		
		con.add(jl3);
		
		JScrollPane scroll = new JScrollPane(jta1);
		con.add(scroll);

		
//익명구현객체		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 익명구현객체");
				jl3.setText("익명구현객체로 만든 버튼1 클릭");
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//익명구현객체 안에서 메시지 상자 함수 호출
				confirmExit();
			}
		});
		
		
		JOptionPane.showMessageDialog(this, "파일을 읽었습니다.", "파일읽기", JOptionPane.INFORMATION_MESSAGE);
		
	}//constructor
	
	
//메시지 상자
	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		if(answer==JOptionPane.YES_OPTION) {
			System.out.println("종료합니다.");
			System.exit(0);
		} else {
			System.out.println("종료를 취소합니다.");
			jl3.setText("종료를 취소합니다.");
		}
	}//method
	

	//3.main method에서 MyFrame instance 생성 하기
	public static void main (String[] args) {
		new MyWin5();
	}//main

	

}//class
