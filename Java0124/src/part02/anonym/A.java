//1 Anonymous Object
package part02.anonym;

class Parent {
	void parentMethod() {

	}
}

public class A {
	
	Parent field = new Parent() {

		//override가 가능하다는 것은, 이 instance가 Parent class의 자식객체라는 것
		@Override
		void parentMethod() {
			super.parentMethod();
		}
		
		int childField;
		void childMethod() {}
		
	};
	
	void method() {
		A var = new A();
		field.parentMethod();
	}
	
}
