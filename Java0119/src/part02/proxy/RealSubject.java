//1 Proxy design pattern
package part02.proxy;

public class RealSubject implements ISubject {

	@Override
	public void action() {
		System.out.println("원본 객체 액션");
	}

}//class
