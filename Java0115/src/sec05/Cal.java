//240115 static/instance
package sec05;

public class Cal {

	static int x;
	
	static int p1() {
		return x+100;
	}
	
	static int m1() {
		return x-100;
	}
	
	static void m2() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		x = 100;
		int y = p1();
		System.out.println(y);
		m2();
	}//main

}//class
