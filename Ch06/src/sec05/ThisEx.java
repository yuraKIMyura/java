//240110 Constructor this()
package sec05;

public class ThisEx {
	
	int x;
	int y;
	int z;

	public ThisEx(int x) {
		this(x, 0, 0);
		System.out.println("constructor 1");
		System.out.println("-".repeat(15));
	}
	
	public ThisEx(int x, int y) {
		this(x, y, 0);
		System.out.println("constructor 2");
		System.out.println("-".repeat(15));

	}
	
	public ThisEx(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("constructor 3");
		System.out.println("-".repeat(15));
	}
	
	public int getX() {
		return x;
	}
	

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public static void main(String[] args) {
		ThisEx ex1 = new ThisEx(1);
		System.out.println("x: " + ex1.getX());
		ThisEx ex2 = new ThisEx(2,3);
		System.out.println("x: "+ex2.getX()+", y: "+ex2.getY());
		ThisEx ex3 = new ThisEx(4,5,6);
		System.out.println("x: "+ex3.getX()+", y: "+ex3.getY()+", z: "+ex3.getZ());
	}//main

}//class
