package sec03;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(true) {
			System.out.print("Enter an integer from 2 to 9 (or Q/q to quit)");
			Scanner scanner = new Scanner(System.in);
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
				for (int i=1 ; i<10 ; i++) {
					System.out.printf("%d X %d = %d \n", num, i, num*i);
				}
			}else if(scanner.nextLine().equalsIgnoreCase("q")) break;
			scanner.close();
		}
		System.out.print("=".repeat(50) + "\nQuitting Times Table");

	}

}
