package sec03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("num1>");
		int num1 = scanner.nextInt();
		System.out.println("num2>");
		int num2 = scanner.nextInt();
		int sum = 0;
		
		int min = 0;
		int max = 0;
		
		if(num1 > num2) {
			min = num2;
			max = num1;
		} else if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = max = num1 = num2;
		}
		
		scanner.close();
		
		for(int i = min+1; i<max; i++) {
			sum += i;
			System.out.printf("%d ", i);
		}
		System.out.printf("\nthe sum between %d and %d is %d", min, max, sum);
		
	}
}
