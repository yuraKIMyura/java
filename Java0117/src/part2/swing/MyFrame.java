//2 java GUI swing 설정 방법 1
//상속을 통해 JFrame을 다 내 것처럼 사용
//this 생략 가능하지만, 사용가능 함수에서 
package part2.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1.extends JFrame 해야 함
public class MyFrame extends JFrame{

	//생성자에서 여러 값 설정하는 중
	//내부 코드 순서는 상관 없음. constructor가 끝나야 적용이 되기 때문!
	public MyFrame() {
		
		//JFrame > Frame > Menu Bar + Content Pane
		Container con = this.getContentPane();
		//component layout은 신경쓰지 않겠다... 우리 공부에는 없으니까!
		//노가다로 component 하나씩 위치를 주도록 하겠다
		con.setLayout(null);
		
		JButton jb1 = new JButton("버튼");
		jb1.setLocation(20,20);
		jb1.setSize(100,30);
		con.add(jb1);
		
		JButton jb2 = new JButton("버튼");
		jb2.setLocation(120,20);
		jb2.setSize(100,30);
		con.add(jb2);
		
		JLabel jl = new JLabel("라벨");
		jl.setLocation(20,50);
		jl.setSize(100,100);
		con.add(jl);
		
		JTextField jtf = new JTextField();
		jtf.setLocation(220,20);
		jtf.setSize(100,30);
		con.add(jtf);
		
		//모니터에 뜨는 위치
		this.setLocation(800, 400);
		
		//화면의 최상단에 보임
		this.setTitle("스윙 연습");
		
		//MyFrame instance가 보이도록 constructor에서 설정	
		this.setVisible(true);
		
		//크기 설정
		this.setSize(600, 300);
		
		//화면을 닫으면 프로그램이 자동 종료되도록 설정 
		//(이 설정 없으면 console에서 직접 terminate 해야 memory에서도 unload됨)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String...args) {
		//2.MyFrame class instantiation	
		new MyFrame();
	}
	
}
