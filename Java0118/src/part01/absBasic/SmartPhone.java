//1 ABSTRACT 추상클래스는 객체 생성이 불가
//반드시 subclass의 constructor에서 super 호출 필요
//반드시 subclass의 abstract method override 필요(안 할 거면 subclass도 abstract class하기)
package part01.absBasic;

public abstract class SmartPhone extends Phone {

	public SmartPhone(int x) {
		super(x);
	}

	public abstract void test();
	
}//class
