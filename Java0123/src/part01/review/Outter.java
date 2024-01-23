//2 nested class review: local class
package part01.review;

public class Outter {

	public void method2(int arg) {
		//지역변수들은 method가 끝나면 사라져야 됨
		//그런데 '스레드'라는 개념에서는 메소드가 종료되어도 계속 남아 있을 수 있음
		int localVar = 1;
		arg = 100;
		localVar = 100;
		
		class Inner{
			public void method() {
				//int result = arg + localVar;
			}
		}
		
		
		
	}
	
}
