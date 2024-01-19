//6 swing mini test
package part01.swingExercise;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1.JFrame extends 하기
public class MyFrame extends JFrame implements ActionListener{
	
	JLabel jl1 = new JLabel("label1");
	JButton jb1 = new JButton("button1");	
	JTextField jtf1 = new JTextField("textfield1");

	
	//2.constructor에서 설정하기 
	public MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(750,300);
		this.setTitle("1.윈도우를 만들어 보세요.");
		
		Container con = this.getContentPane();
		con.setLayout(null);
		
		jl1.setSize(70,20);
		jl1.setLocation(20,20);
		
		jb1.setSize(70,20);
		jb1.setLocation(100,20);
		
		jtf1.setSize(70,20);
		jtf1.setLocation(180,20);
		
		con.add(jl1);
		con.add(jb1);
		con.add(jtf1);
		
		jb1.addActionListener(this);
		
		
	}
	
	//3.main method에서 MyFrame instance 생성 하기
	public static void main (String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
	}
	

}
