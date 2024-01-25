//6 NumberFormatException
package part01.exception;

public class NumberFormat {

	public static void main(String[] args) {
		
		try {
			int x = Integer.parseInt("aa");
			System.out.println(x);
		}catch(NumberFormatException e) {
			System.out.println("exceptpion 발생");
		}		
	}
	
}//class
