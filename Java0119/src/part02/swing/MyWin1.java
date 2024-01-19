//1 swing review: event 추가까지
package part02.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1.JFrame extends 하기
public class MyWin1 extends JFrame implements ActionListener{
	
	JLabel jl1 = new JLabel("label1");
	JButton jb1 = new JButton("button1");	
	JTextField jtf1 = new JTextField("textfield1");
	
	JLabel jl2 = new JLabel("label2");
	JButton jb2 = new JButton("button2");	
	JTextField jtf2 = new JTextField("textfield2");

	
	//2.constructor에서 설정하기 
	public MyWin1(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		
		//여기서 this는 main method에서 생성된 new MyWin()을 의미한다
		//그래서 MyWin class 안에 들어있는 모든 것에 대해 addActionListener 할 수 있게 됨
		//interface에 의해 재정의된 actionPerformed 함수를 실행시켜주는 코드
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
	}
	
	//3.main method에서 MyFrame instance 생성 하기
	public static void main (String[] args) {
		new MyWin1();
	}

	// getSource() method returns the object that fired the event
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)) {
			System.out.println("버튼1");
		}else if(e.getSource().equals(jb2)) {
			System.out.println("버튼2");
		}
	}
	

}//class
