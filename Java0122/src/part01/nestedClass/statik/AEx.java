//2 static nested class 
package part01.nestedClass.statik;

public class AEx {

	public static void main (String[] args) {
		
		A.C.field2 = 3;
		A.C.method2();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
	}

}
