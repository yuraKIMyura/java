//4 중첩
package part01.nested;

public class Outter {

	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
			
		}
		
	}//class Nested
	
	
	public static void main(String ...strings) {
		Outter outter = new Outter();
		Nested nested = outter.new Nested();
		
		nested.print();
	}
	
}
