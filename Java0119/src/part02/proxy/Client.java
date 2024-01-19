//1 Proxy design pattern
package part02.proxy;

public class Client {

	public static void main(String[] args) {
		
		//원래는 이렇게 했었다는 것임
		ISubject sub1 = new RealSubject();
		sub1.action();
		
		//이 아래의 코드가 패턴을 적용한 것임
		//the proxy serves as an intermediary or middle phase between the client (which interacts with the proxy) and the real object (which performs the actual work)
		ISubject sub = new Proxy(new RealSubject());
		sub.action();
		
	}//main
	
}//class
