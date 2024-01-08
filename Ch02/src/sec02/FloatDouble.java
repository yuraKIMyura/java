//240103 숫자 계산 시 주의사항, ASCII, 자동형변환
package sec02;

public class FloatDouble {

	public static void main(String[] args) {
		
//double, float 잘못 쓰면 상상도 못한 값들이 나올 것이다
		
		float num1 = 123.45678901234567890123f;
		double num2 = 123.45678901234567890123;
		
		System.out.println("float 변수: " + num1);
		System.out.println("double 변수: " + num2);
		
		double var1 = 0.1;
		for (int i = 0; i<10; i++) {
			var1 += 0.1;
		}
		System.out.println(var1);
		
//ASCII CODE char var = 65;
		char var2 = 65;
		System.out.println(var2);

//자동형변환		
		String str1 = 10 + 2 + ""; //계산하고 ""로 얼림
		String str2 = "" + 10 + 2; //""로 얼리고 붙임
		String str3 = "" + (10+2); //()로 계산우선순위 부여
		String str4 = String.valueOf(10+2);
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
		
	}//main



}//class
