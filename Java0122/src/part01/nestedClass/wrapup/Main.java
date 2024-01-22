//3 nested classes wrap-up
package part01.nestedClass.wrapup;

import part01.nestedClass.wrapup.A.C;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		/**instance nested class instance**/
		A.B b = a.new B();
		b.field1 = 100;
		b.method1();
		

		C.field2=200;
		C.method2();
		/**static nested class instance**/
		A.C c = new A.C();
		c.field1 = 200;
		c.method1();
		
		/**local class instance**/
		
		a.method();
		
	}

}
