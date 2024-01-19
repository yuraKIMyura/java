//6 swing mini test
package part01.swingExercise;

import javax.swing.JFrame;

//1.JFrame extends 하기
public class MyFrame extends JFrame{
	
	//2.constructor에서 설정하기 
	public MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(750,300);
		this.setTitle("1.윈도우를 만들어 보세요.");
	}
	
	//3.main method에서 MyFrame instance 생성 하기
	public static void main (String[] args) {
		new MyFrame();
	}
	

}
