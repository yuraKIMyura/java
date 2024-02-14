package lambda;

public class MyFuncEx {

	public static void main(String[] args) {
		
		MyFunc myFunc1, myFunc2;
		
		myFunc1 = new MyFunc() {

			@Override
			public void method(int x) {
				System.out.println(x);
			}
		};
		myFunc1.method(1);
		
		
		myFunc2 = x -> System.out.println(x);
		myFunc2.method(2);

		
	}//main

}
