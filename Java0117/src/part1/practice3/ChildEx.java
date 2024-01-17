//4 Type Casting and Access Scope Issue in Inheritance
package part1.practice3;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1"; //Parent's field
		parent.method1(); //Parent's method
		parent.method2(); //Parent's method
		
		//parent.field2 = "data2"; 
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		
	}

}//class
