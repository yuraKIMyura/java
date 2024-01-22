//2 inner class call syntax + scope
package part01.nestedClass.instance;

public class AEx {

	public static void main(String[] args) {
		A a = new A();
		//a.field1 = 3;
		//a.method1();
		A.field3 = 4;
		a.methodA();
		
		A.B b1 = a.new B();
		b1.field1 = 3;
		b1.method1();
		//B.field3 = 4;
		//b1.methodA();
		
		A.B b2 = new A().new B();
		b2.field1 = 3;
		b2.method1();
		//B.field3 = 4;
		//b2.methdA();
		
	}

}
