package part02.anonym;

public class Main {

	public static void main(String[] args) {

		Anonymous anon = new Anonymous();
		anon.field.wake();
		
		anon.method1();
		
		anon.method2(new Person() {
			void study() {
				
			}
		});
		
	}

}
