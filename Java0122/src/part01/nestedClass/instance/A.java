//2 STATIC modifier
package part01.nestedClass.instance;

public class A {
	
	static int field3; //가능
	
	class B{
		B(){};
		int field1;
		//static int field2; 
		/* 불가능: A instance가 생성되어야 class B가 만들어지는데, 
				   A instance가 만들어지기도 전에 field2가 만들어짐. 모순! */
		void method1() {}
		//static void mehotd2() {}
	}
	
	void methodA() {
		//class B의 객체생성 필요!
		B b = new B();
		b.field1 = 3;
		b.method1();
	}

}
