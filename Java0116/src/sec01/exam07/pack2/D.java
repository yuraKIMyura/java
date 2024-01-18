//5 protected access modifier
package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A {

	//new 연산자를 사용해서 생성자를 직접 호출 불가	
	//자식 생성자에서 super()로 생성자를 호출 가능	
	
	public void method() {
		//A a = new A();
		this.field = "value";
		this.method();
	}
		
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	


}
