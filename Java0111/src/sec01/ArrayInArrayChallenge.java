//240111 multidimensional array
//미친 것 같음.. For statement Indice 제대로 공부할 것!
package sec01;

import java.util.Scanner;

public class ArrayInArrayChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int firstNum = print(scanner, "array[n][] n 입력 >");
		int secondNum = print(scanner, "array[][m] m 입력 >");
		int array[][] = createArray(firstNum, secondNum);
		array = inputIndex(scanner, array);
		printArray(array);
		calculateRowAverage(array);
		calculateColumnAverage(array);
	}
	
	public static int print(Scanner scanner, String message) {
		System.out.println(message);
		int number = Integer.parseInt(scanner.nextLine());
		return number;
	}
	
	public static int[][] createArray(int first, int second){
		int[][] array = new int[first][second];
		return array;		
	}
	
	public static int[][] inputIndex(Scanner scanner, int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%d번째 배열의 %d번째 요소> \n", i,j);
				array[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void calculateRowAverage(int[][] array) {
		int sum = 0;
	
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
			}
			double avr = (double)sum/(array[i].length);
			System.out.printf("[%d번] 총점: %d / 평균: %.2f\n", i, sum, avr);
		}
	}

// For loop indice를 제대로 이해하지 못한 코드	
//	public static void calculateColumnAverage(int[][] array) {
//		int col = 0;
//		boolean isValid=true;
//		
//		
//		while(isValid) {
//			int sum = 0;
//			int count = 0; 
//			
//			for(int i=0; i<array.length; i++) {
//				if(col<array[i].length) {
//					sum+=array[i][col];
//					count ++;
//				}else {
//					isValid = false;
//				}
//			}
//			col++;
//			if(isValid) {
//				System.out.println("항목별 총합: "+sum);
//				System.out.println("항목별 평균: "+(double)sum/count);
//			}
//		}//while
//		
//	}//method
	
//For Loop Indice를 제대로 이해한 method	
	public static void calculateColumnAverage(int[][] array) {

		for(int i=0; i<array.length; i++) {
			int sum = 0;

			for(int j=0; j<array[i].length; j++) {
				sum+=array[j][i];
			}
			double avr = (double)sum/(array[i].length);
			System.out.printf("[%d열] 총점: %d / 평균: %.2f\n", i, sum, avr);
		}
	}
	
}//class


