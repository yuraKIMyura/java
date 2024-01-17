//1 subclass method overriding + polymorphism
//my guess was wrong! Check reference variable type and actual object type
package part1;

public class ChildEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
	}

}//class
