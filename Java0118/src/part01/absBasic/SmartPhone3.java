//1 ABSTRACT 추상클래스는 객체 생성이 불가
//반드시 subclass의 constructor에서 super 호출 필요
//반드시 subclass의 abstract method override 필요(안 할 거면 subclass도 abstract class하기)
package part01.absBasic;

public class SmartPhone3 extends SmartPhone{

	public SmartPhone3(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ring(int tel) {
		// TODO Auto-generated method stub
		
	}

}
