//240115 static member, instance member comparison
package sec05;

public class ClassName {
	
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	static void method3() {
		//field1 = 10; //객체 생성 후 사용 가능. instance member이기 때문에 static method는 접근 불가
		ClassName cn = new ClassName();
		cn.field1 = 10;
		field2 = 10; //즉시사용가능
	}
	
	void method4(){ //객체 생성 후 사용 가능.
		this.field1 = 10; 
		ClassName.field2 = 10; //즉시사용가능: static member이기 때문에 instance method에서 사용 가능
	}
	
}//class
