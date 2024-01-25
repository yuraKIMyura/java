//7 throw, throws
package part01.exception;

class ThrowClass{
	
	void method(int x) throws Exception {
		if(x>10) {
			throw new Exception("유라 예외 발생");
		} else {
			System.out.println(x);
		}
	}

}//class

public class ThrowAndThrows {

	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
			tc.method(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}//class
