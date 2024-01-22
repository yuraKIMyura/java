//3 nested classes wrap-up
package part01.nestedClass.wrapup;

public class A {
	
	A(){
		System.out.println("A객체생성");
	}
	
	/**instance nested class**/
	class B {
		
		B(){
			System.out.println("B객체생성");
		}
		
		int field1;
		//static int field2; //불가능
		void method1() {}
		//static void mehotd2() {}
		
	}//classB

	/**static nested class**/
	static class C{
		C(){
			System.out.println("C객체생성");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}//classC
	
	
	void method() {
		/**local nested class**/
		class D{
			D(){
				System.out.println("D객체생성");
			}
			
			int field1;
			//static int field2; //method 내에서만 쓰이기 때문에 모든 modifier 불가능
			void method1() {}
			//static void method2() {}
		}//classD
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
	}//method

		
}//classA

