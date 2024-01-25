//9 new way for custom exception
package part01.customException;

class MyClass2{
	
	void method() {
		throw new MyException2("첫 실행 예외");
	}
	
}

public class MyExceptionMain2 {

	public static void main(String[] args) {

		MyClass2 mc = new MyClass2();
		try {
			mc.method();
		} catch(MyException2 e) {
			System.out.println("내가 만든 실행 예외");
		}
		
	}

}
