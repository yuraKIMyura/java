//2 static nested class 
package part01.nestedClass.statik;

public class A {
	
	static class C {
		C(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void methodB() {
		C c = new C();
		c.field1 = 3;
		C.field2 = 3;
		c.method1();
		C.method2();	
	}
	

}
