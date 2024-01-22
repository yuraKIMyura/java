//4 nested class modifier
package part01.nestedClass.modifier;

public class A {
	
	B field1 = new B();
	C field2 = new C();
	
	static B field3 = new A().new B();
	//static B field3 = new B();
	/*[논리적 오류]
	 * new B() 때문에 error 발생 
	 *class A instance가 생성되지 않으면 class B의 instance도 없는데,
	 *class A가 instantiate 되기 전에 class B가 static으로 만들어져 있다니!
	 */
	static C field4 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	
	
	class B{}
	static class C{}

}
