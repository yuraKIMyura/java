package sec03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		boolean isA = false;
		boolean isB = false;
		
		Scanner scanner = new Scanner(System.in);
		
		while(!isA) {
			//System.out.println("Please enter integer A >0");
			A = scanner.nextInt();
			if(A<1) {
				//System.out.println("A should be greater than 0");
			}else {
				isA = true;
				//System.out.println("A is "+A);
			};
		}
		
		while(!isB) {
			//System.out.println("Please enter integer B < 10");
			B = scanner.nextInt();
			if(B>10000) {
				//System.out.println("B should be less than 10");
			}else {
				isB = true;
				//System.out.println("B is "+B);
			};
		}
		
		scanner.close();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);


	}

}
