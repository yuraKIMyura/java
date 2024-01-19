//1 Proxy design pattern
package part02.proxy;

public class Proxy implements ISubject {

	//1.Interface를 구현하는 다른 class의 instance를 field로 사용
	private RealSubject realSubject;
	
	//Proxy instance 생성에 RealSubject를 주입
	public Proxy(RealSubject realSubject) {
		super();
		this.realSubject = realSubject;
	}

	//RealSubject의 method를 실행시킴
	@Override
	public void action() {
		System.out.println("......로깅......");
		System.out.println("프록시 객체 액션");
		realSubject.action();
		System.out.println("......로깅......");
	}


}//class