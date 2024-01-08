//240104 연산자
//사칙연산이 포함되면 결과가 int가 되므로 이 결과값을 저장하는 data type이 int가 아닐 경우 casting 필요
package sec01;

public class OperatorExercise {

	public static void main(String[] args) {

//1.선행,후행		
		int x=1;
		int y=1;
		
		int resultX = x++ + 10; //1로 연산 완료하고 증가 시킴 
		System.out.println(resultX);
		
		int resultY = ++y + 10; //2로 증가 시키고 연산 완료함
		System.out.println(resultY);
		
//2.casting		
		byte b = 100;
		//byte result = -b; // -1 * b로 연산되어 type이 int가 됨
		byte resultCast = (byte) -b;
		System.out.println(resultCast);

//3.char ASCII code		
		for(int i=0; i<26; i++) {
			char c1 = 'A';
			//c1 = 'A' + i; // A + 0으로 연산되어 type이 int가 됨
			c1 = (char) ('A' + i);
			System.out.println(c1);
		}//
		
		String str = "JDK" + (3 + 3.0);
		System.out.println(str);
		
		boolean b1 = 'A' < 'B';
		System.out.println(b1);
		int num2 = 'B' - 'A';
		System.out.println(num2);
		
//4.boolean
		System.out.println(0.1==0.1f); //false
		System.out.println((float)0.1==0.1f); //true
		System.out.println(0.1==(double)0.1f); //false
		System.out.println(3==3.0); //true implicit type conversion for primitive types
		System.out.println('A'==65); //true
		
//5.logic
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		if( (charCode>=97) & (charCode<=122)) {
			System.out.println("소문자");
		}
		if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0-9 숫자");
		}
		
	}//main
}//class
