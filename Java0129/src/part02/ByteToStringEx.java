//2 String class
package part02;

public class ByteToStringEx {

	public static void main(String[] args) {

		byte[] bytes = {72, 101, 108, 108, 111};
		String str = new String(bytes);
		System.out.println(str);
		
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		str = new String(chars);
		System.out.println(str);
	}

}//class
