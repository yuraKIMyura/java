package lambda;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		
		MyFunctionalInterface mfi = (x, y) -> (x+y);
		System.out.println(mfi.method(1,1));
		
		/*추상메소드 method(int x, int y)를 실행했을 때, sumint(int x, int y) method를 return 해라*/
		MyFunctionalInterface mfi2 = (x,y) -> sum(x,y);
		System.out.println(mfi2.method(2,2));
		
	}//main
	
	public static int sum(int x, int y) {
		return x+y;
	}

}
