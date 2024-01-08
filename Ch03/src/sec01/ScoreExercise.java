package sec01;

import java.util.Scanner;

public class ScoreExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수> ");
		int score = scanner.nextInt();

//if-else
		System.out.println("if-else");
		if (score <=100 && score>=0) {
			if (score>=90) {
				System.out.println("A");
			}else if (score>=80) {
				System.out.println("B");
			}else if (score>=70) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
		}else {
			System.out.println("점수오류");
		}
		
//switch		
		System.out.println("switch");
		if(score<=0 && score>=100) {
			int condition = score/10;
			switch(condition) {
			case 10: case 9: System.out.println("A"); break;
			case 8: System.out.println("B"); break;
			case 7: System.out.println("C"); break;
			case 6: case 5: case 4: case 3: case 2: case 1: case 0: System.out.println("D"); break;
			}//switch
		}else System.out.println("점수 오류");
		
	}//main

}//class
