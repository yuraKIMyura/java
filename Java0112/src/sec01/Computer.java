//240112 매개변수의 개수를 모르는 경우
package sec01;

public class Computer {

	int sum1(int[] values) {
		int sum=0;
		for(int numbers : values) {
			sum += numbers;
		}
//		for(int i=0 ; i<values.length; i++) {
//			sum += values[i];
//		}
		return sum;
	}//method
	
	int sum2(int ... values) {
		int sum=0;
		for(int numbers : values) {
			sum += numbers;
		}
//		for(int i=0 ; i<values.length; i++) {
//			sum += values[i];
//		}
		return sum;
	}//method
	
}//class
