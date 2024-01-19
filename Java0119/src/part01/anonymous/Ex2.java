//5 익명객체(3)
package part01.anonymous;

interface Inter{
	void disp();
}//interface

public class Ex2 {
	
	public static void main(String[] args) {
		
		//익명구현객체
		Inter it = new Inter() {

			int y = 100; 
			
			public void disp2() {
				System.out.println("disp2() method");
			}
			
			@Override
			public void disp() {
				System.out.println(y);
			}
			
		};
		
		it.disp();
		//it.disp2();
		//The interface Inter declares a method disp(), but it doesn't declare a method disp2(). 
		//When you declare a variable to be of an interface type, you can only access methods that are declared in that interface.
		
	}//main
	
}//class
