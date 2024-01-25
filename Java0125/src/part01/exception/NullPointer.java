//5 RuntimeException: NullPointerException

package part01.exception;

class MyClass{
	void method() {}
}

public class NullPointer {

	public static void main(String[] args) {
		MyClass mc = null;
		System.out.println(mc);
		mc.method();
		
		//String data = null;
		//System.out.println(data.toString());
	}

}
