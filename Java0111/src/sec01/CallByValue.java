//240111 call by value, call by reference
package sec01;

class MyClass {
	
	int n;
		
}//class


public class CallByValue {

	public static void increase(int n, MyClass sample) {
		n++;
		System.out.println(n);
		sample.n++;
		System.out.println(sample.n);
	}//method
	
	public static void main(String[] args) {
		int n = 100;
		MyClass sample = new MyClass();
		System.out.println(sample.n);
		
		//increase(n, sample);
		increase(n, new MyClass());
		System.out.println(n);
		System.out.println(sample.n);
		

	}//main

}//class

