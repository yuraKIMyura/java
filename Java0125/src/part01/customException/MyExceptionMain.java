//8 Custom Exception
package part01.customException;


class MyClass1 {
	
	void method() throws MyException {
		throw new MyException("또 예외 상황");
	}
	
}//class


public class MyExceptionMain {

	public static void main(String[] args) {
		MyClass1 mc = new MyClass1();
		try {
			mc.method();
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}

}
