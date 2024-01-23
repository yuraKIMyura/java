//1 nested class review: static modifier
package part01.review;

public class A {

	public static void main(String[] ar) {
		
		//A가 생성되지 않으면 B를 쓸 수 없다
		//B b1 = new B();
		
		A a = new A();
		B b2 = a.new B();
		
		B b3 = new A().new B();
	}
	
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			System.out.println("method(), "+field1);
		}
	}
	
	//field2 is not a member of the C class or any of its enclosing classes (A in this case).
	//In Java, a static nested class (C in this case) does not have access to the instance variables or methods of the enclosing class (A), even if they are marked as static. 
	//The field2 and method2() are part of the non-static context of class A, and static nested classes do not have access to non-static members of the enclosing class without an instance of the enclosing class.
	static class C{
		void method() {
			//field2 = 10;
			//method2();
			//System.out.println("method(), "+field2);
		}
	}
	
}
