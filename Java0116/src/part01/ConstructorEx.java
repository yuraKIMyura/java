//4 inheritance constructor (inherent super)
package part01;

class A{
	public A() {
		System.out.println("생성자A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}


public class ConstructorEx {
	public static void main(String args[]) {
		C c = new C();
	}
}
