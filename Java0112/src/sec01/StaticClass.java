//240112 static method 호출, this
package sec01;

class MyClass{

	void method1() {
		System.out.println(this.toString());
		System.out.println("method1");
	}

	static void method2() {
		//System.out.println(this.toString());
		System.out.println("method2");
	}

}

public class StaticClass {
	
	static void method3() {
		System.out.println("method3");
	}
	
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		mc.method1();
		//mc.method2();
		MyClass.method2();
		
		StaticClass.method3();
		method3();
	}

}
