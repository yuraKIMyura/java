//1 swing
//익명 구현 객체 생성으로 event 추가하기
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
public class MyWin2 extends JFrame{
	
	JLabel jl1 = new JLabel("label1");
	JButton jb1 = new JButton("button1");	
	JTextField jtf1 = new JTextField("textfield1");
	
	JLabel jl2 = new JLabel("label2");
	JButton jb2 = new JButton("button2");	
	JTextField jtf2 = new JTextField("textfield2");

	
	//2.constructor에서 설정하기 
	public MyWin2(){
		
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
		
//익명구현객체		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 익명구현객체");
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2 익명구현객체");
			}
		});
		
	}
	
	//3.main method에서 MyFrame instance 생성 하기
	public static void main (String[] args) {
		new MyWin2();
	}

	

}
