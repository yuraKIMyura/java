//240111 Array 정리 문제
package sec01;

public class ArrayTest {

	public static void main(String[] args) {
				
//[문제1-3] 1.합계, 2.평균, 3.최댓값
		System.out.println("[문제1-3] 1.합계 2.평균 3.최댓값");
		int a [] = {1, 3, 10, 2, 8};
		calculate(a);

//[문제4] 4가 있는 index 출력
		System.out.println();
		System.out.println("[문제4] 4가 있는 인덱스 출력");
		System.out.println("{9, -1, 10, 3, 1, 88, 4, 2, 4, -13}");
		int b [] = {9, -1, 10, 3, 1, 88, 4, 2, 4, -13};
		findIndex(4, b);

//[문제5] x와 y 값을 바꾸는 프로그램
		System.out.println();
		System.out.println("[문제4] x=10, y=20 바꾸기");
		int x = 10;
		int y = 20;
		exchange(x,y);
		
//[문제6] 버블정렬
		System.out.println();
		System.out.println("[문제5] 버블 정렬 알고리즘");
		System.out.println("{9, -1, 10, 3, 1, 88, 4, 2, 4, -13}");
		bubbleSortAsc(b);
		bubbleSortDesc(b);
		
	}//main

	
	public static void calculate(int[] array) {
		int sum = 0;
		int max = array[0];
		
		for(int i=0; i<array.length; i++) {
			sum += sum + array[i];
			if(array[i]>=max) max=array[i];
		}
		
		double avg = (double)sum/array.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최댓값: " + max);
	}//method
	
	public static void findIndex(int number, int[] array) {
		int count = 1;
		for(int i=0; i<array.length; i++) {
			if(array[i]==number) {
				System.out.println(number+"의 "+count+"번째 인덱스: "+i);
				count++;
			}
		}
	}//method
	
	public static void exchange(int num1, int num2) {
		int temp=0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("x: "+num1+", y: "+num2);
	}//method
	
	public static void bubbleSortAsc(int[] array) {
		System.out.print("오름차순 ");
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}//for
		
		printArray(array);
		
	}//method
	
	public static void bubbleSortDesc(int[] array) {
		System.out.print("내림차순 ");
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}//for
		
		printArray(array);
		
	}//method
	
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
				System.out.print(array[i]+" ");
		}System.out.println();
	}//method

}//class
