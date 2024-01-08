//240108 Static

public class StaticEx {
	
	static int y; //initialization 안 해도 자동으로 됨!

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("y: "+y);
		y=300;
		int x = 100;
		System.out.println("x: "+x);
		m1(100);
		System.out.println("x is still 100, see: "+x);
	}
	
	public static void m1(int x) {
		System.out.println("m1 method");
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		x = 200;
	}

}
