package sec03;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		System.out.println("system on");
		System.out.println("=".repeat(30));
		String message="";


        System.out.println("Please enter an integer ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
        	System.out.print("for " + i);
            
            if(!scanner.hasNextInt()) {
            	System.out.println("Make sure your input is an integer");
            	scanner.next();
            	i--;
            	continue;
            }

            int score = scanner.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Your entered score is out of range");
                i--;
                continue;
            } 
            
            switch (score / 10) {
	            case 10:
	            case 9:
	            message = score + " is an A";
	            break;
	            
	            case 8:
	            message = score + " is a B";
	            break;
	            
	            case 7:
	            message = score + " is a C";
	            break;
	            
	            case 6: case 5: case 4: case 3: case 2: case 1: case 0:
	            message = "You will get better with time";
	            break;
            
            	default:
            	message = "We have encountered some kind of an error";
            }

            System.out.println(message);
           	
        }
       
        scanner.close();
        System.out.println("=".repeat(30));
        System.out.println("system off");
	}
}
