//1 ABSTRACT 추상클래스는 객체 생성이 불가
//반드시 subclass의 constructor에서 super 호출 필요
//반드시 subclass의 abstract method override 필요(안 할 거면 subclass도 abstract class하기)
package part01.abs;

public abstract class Phone {
	
	public int x;

	//추상클래스 생성자 만드는 순간 subclass에서 오류 발생!
	public Phone(int x) {
		this.x = x;
	}
	
	public abstract void ring(int tel);
		
}//class
