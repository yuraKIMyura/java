//2 java GUI swing 설정 방법 2
//객체를 생성해서 사용
package part2.swing;

import javax.swing.JFrame;

public class MyFrameAlternative {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
