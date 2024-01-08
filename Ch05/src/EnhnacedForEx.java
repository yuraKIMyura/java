//240108 enhanced for loop을 이용한 최댓값 찾기

import java.util.Scanner;

public class EnhnacedForEx {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		//for(int i=0; i<array.length; i++) {
		//	if(array[i]>=max) max=array[i];
		//}

//향상된 반복문 + index 처리
		int index = 0;
		int maxIndex = 0;
		for(int  value : array) {
						
			if(value>=max) {
				max=value;
				maxIndex = index;
			}
			index++;
		}
		
		System.out.println("최댓값: "+max);
		System.out.println("최댓값의 배열: "+maxIndex);

//enhnaced for loop 
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("배열 길이 입력 > ");
//		int length = scanner.nextInt();
//		
//		int[] numbers = new int[length];
//		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println("배열 값 입력 > ");
//			numbers[i] = scanner.nextInt();
//		}
//		
//		for(int value:numbers) {
//			if(value>=max) {
//				max = value;
//			}
//		}
//		
//		System.out.println("최댓값: " +max);	
		
	}//main

}//class
