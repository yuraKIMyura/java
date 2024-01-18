//3 JavaSwing(action) + interface
package part02.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener, MouseListener{

//component+event사용을 위해 field로 component를 올려줍니다.	
	JButton jb = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");

//1.constructor 안에 설정해줍니다.	
	public MyFrame2() {
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");

		//2.container 만들어서 component를 붙입니다.
		Container con = this.getContentPane(); 
		con.setLayout(new FlowLayout());

		//3.component 만들어서 container에 붙여줍니다.
		//(field로 올려버렸습니다.)
		con.add(jb);		
		con.add(jb2);
				
		//5.event를 추가해봅시다.
		jb.addActionListener(this);
		jb2.addActionListener(this);
		
		con.addMouseListener(this);
		

	}
	

//4.main method에서 instantiate 해줍니다.	
	public static void main(String[] args) {
			new MyFrame2();
	}

	
//어떤 action이 될지 method를 재정의합니다.
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jb) {
			System.out.println("버튼1");
		} else if (e.getSource()==jb2) {
			System.out.println("버튼2");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY() );
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
	}



}//class
