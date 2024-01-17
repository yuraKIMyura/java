//2 java GUI swing 설정 방법 1
//상속을 통해 JFrame을 다 내 것처럼 사용
package part2.swing;

import javax.swing.JFrame;

//1.extends JFrame 해야 함
public class MyFrame extends JFrame{
	
	public MyFrame() {
//3.MyFrame instance가 보이도록 constructor에서 설정	
		this.setVisible(true);
//4.크기 설정
		this.setSize(300, 300);
//5.화면을 닫으면 프로그램이 자동 종료되도록 설정 
//(이 설정 없으면 console에서 직접 terminate 해야 memory에서도 unload됨)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String...args) {
//2.MyFrame class instantiation	
		new MyFrame();
	}
	
}
