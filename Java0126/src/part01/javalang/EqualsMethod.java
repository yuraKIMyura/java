//1 equals() method
package part01.javalang;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String str1 = "가나다";
		String str2 = "가나다";
		System.out.println(str1==str2); //true 왜?????
		
		System.out.println("-".repeat(10));
		
		String str3 = new String("가나다");
		String str4 = new String("가나다");
		System.out.println(str3==str4); //false
		System.out.println(str3.equals(str4)); //true
		
		System.out.println("-".repeat(10));

		Object obj1 = new Object();
		Object obj2 = new Object();		
		System.out.println(obj1 == obj2); //false 왜?????
		System.out.println(obj1.equals(obj2)); //false
		
	}//main
	
	
}//class
