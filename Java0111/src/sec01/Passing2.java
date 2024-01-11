//240111 Call by reference: 같은 reference를 확인 가능. 
package sec01;

class YourClass{
	
}

public class Passing2 {

	public static void main(String[] args) {
		YourClass yc1 = new YourClass();
		System.out.println("[main] " + yc1);
		method1(yc1);
		YourClass yc2 = new YourClass();
		System.out.println("[새로운 객체] " + yc2);
	}
	
	public static void method1(YourClass yc) {
		System.out.println("[method1] " + yc);
		return;
	}

}
