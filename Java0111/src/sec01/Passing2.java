//240111 Call by reference: 같은 reference를 확인 가능. 
package sec01;

class YourClass{
	int x;
}

public class Passing2 {

	public static void main(String[] args) {
		YourClass yc1 = new YourClass();
		//System.out.println("[main] " + yc1);
		System.out.println("[BEFORE] " + yc1.x);
		method1(yc1);
		System.out.println("[AFTER] " + yc1.x);
				
		//YourClass yc2 = new YourClass();
		//System.out.println("[새로운 객체] " + yc2);
	}
	
	public static void method1(YourClass yc) {
		//System.out.println("[method1] " + yc);
		yc.x = 300;
		return;
	}

}
