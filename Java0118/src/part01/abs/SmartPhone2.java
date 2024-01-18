//1 ABSTRACT 추상클래스는 객체 생성이 불가
//반드시 subclass의 constructor에서 super 호출 필요
//반드시 subclass의 abstract method override 필요(안 할 거면 subclass도 abstract class하기)
package part01.abs;

public class SmartPhone2 extends Phone{

	int y;
	
	public SmartPhone2(int x) {
		super(x);
	}
	
	public SmartPhone2(int x, int y) {
		super(x);
		this.y = y;
	}
	
	//superclass Phone으로부터 받음
	public void printX() {
		System.out.println(x);
	}
	
	@Override
	public void ring(int tel) {
		// TODO Auto-generated method stub
		
	}
	
}
