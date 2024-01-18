//3 JavaSwing(action) + interface
package part02.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
	
}//class


public class MyFrame extends JFrame{

//1.constructor 안에 설정해줍니다.	
	public MyFrame() {
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");

		//2.container 만들어서 component를 붙입니다.
		Container con = this.getContentPane(); 

		
		//3.component 만들어서 container에 붙여줍니다.
		con.setLayout(new FlowLayout());
		JButton jb = new JButton("버튼1");
		con.add(jb);
		
		JButton jb2 = new JButton("버튼2");
		con.add(jb2);
		
		//5.event를 추가해봅시다.
		jb.addActionListener(new MyAction());
		jb2.addActionListener(new MyAction());
		
	}
	
	
	
//4.main method에서 instantiate 해줍니다.		
	public static void main(String[] args) {
			new MyFrame();
	}
	
}//class
