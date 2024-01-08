//240103 정적 method, 코딩하는 경우 method를 사용한 module화
package sec02;

public class MethodExercise {

	public static void main(String[] args) {
		method1();
		
		int number = method2();
		System.out.println(number);
		
		int result = method3(1,1);
		System.out.println(result);
	}//main
	
	
	//static은 객체지향 형태가 아님. 
	//static이 없어지면 객체지향 method가 됨.
	public static void method1() {
		System.out.println("정적메소드");
	}//method1
	
	public static int method2() {
		int result = 100;
		return result;
	}//method2
	
	public static int method3(int a, int b) {
		return a+b;
	}//method3

}//class
