//240103 Math.random()
package sec02;
import java.util.Scanner;
public class MultiplicationGameOriginal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many questions would you like?");
		int total = scanner.nextInt();
		System.out.printf("\nOkay, we are going to have %d questions. Let's go!\n", total);
		System.out.println("=".repeat(50));
		
		int point = 0;
				
		for(int i=0; i<total; i++) {
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			
//boolean flag	
//boolean flag will complete the current iteration and then exit the loop
			boolean isValid = true;
			while(isValid) {
				if(num1==0 || num1==1) {
					num1 = (int)(Math.random()*10);
				} else if(num2==0 || num2==1) {
					num2 = (int)(Math.random()*10);
				} else isValid=false;
			}//while

//true-break
//break will exit the loop immediately, even when the current iteration is not complete
//			while(true) {
//				if(num1==0 || num1==1) {
//					num1 = (int)(Math.random()*100);
//				} else if(num2==0 || num2==1) {
//					num2 = (int)(Math.random()*100);
//				} else break;
//			}//while
			
			System.out.printf("Question %d/%d:\n%d X %d = ?\n", i+1, total, num1, num2);
			int input = scanner.nextInt();
				
			if (num1 * num2 == input) {
				System.out.println(input + " is correct.\n");
				point++;
				if(i==total-1) {
					System.out.println("=".repeat(50));
					System.out.println("You got all the questions right!");
				}
			}else {
				System.out.println(input + " is not correct.");
				System.out.println("The correct answer is \"" + num1*num2 + "\"");
				System.out.println("=".repeat(50));
				System.out.printf("\nYou got %d questions out of %d questions right!\n", point, total);
				//break;
			}
			scanner.close();
		}//for
		
		
	}//main
		
}//class



//simple version		

//	while(true) {
//		int num1 = (int)(Math.random()*100);
//		int num2 = (int)(Math.random()*100);
//		
//		System.out.printf("%d X %d = ? ", num1, num2);
//
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//				
//		if (num1 * num2 == input) {
//			System.out.println("Correct");
//		}else {
//			System.out.println("Wrong \nQuitting Game");
//			break;
//		}
//	}//while