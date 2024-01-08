//240103 Math.random(), method를 사용한 모듈화

//1. method를 썼더니 더 지저분해진 느낌
//	readability의 문제로 접근하면 되는 것이다.
//	기능별로 분리가 되어 있어야 좋은 코드!
//2. Scanner scanner = new Scanner(System.in);	
//	이거 처리하는 방법 알려주심
//	main에서 scanner 부르고 매개변수로 scanner를 method마다 보내 버리기
//3. method가 반복이 되고 있어요
//	method 만든 거 다시 쓰면 되잖아요ㅋㅋㅋㅋㅋ
//  하... 나새끼... 멍청이...?

package sec02;

import java.util.Scanner;

public class MultiplicationGame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 사용자에게 자릿수 입력 받기
		int digit1 = setDigit(scanner);
		int digit2 = setDigit(scanner);
		
		// 5. 점수 보여주기(변수 설정)
		int point = 0;

		// 2. 사용자에게 문제 개수 입력 받기
		int total = setQuestionTotal(scanner);
					
		// 4. 문제 생성 + 결과 확인
		for(int i=0; i<total; i++) {
			System.out.printf("Question %d/%d:\n", i+1, total);
			// 3. 숫자 생성
			int num1 = setNumber(digit1);
			int num2 = setNumber(digit2);
			point = generateQuestions(scanner, num1, num2, point);
		}//for 
		
		//5.점수 보여주기(실제 점수)
		showResult(point, total);
		

	}// main
	
	
//1.사용자에게 자릿수 입력 받기
	public static int setDigit(Scanner scanner) {
		System.out.println("Digits for the first number(1 or 2)?");
		int digit1 = scanner.nextInt();
		return digit1;
	}// method

//2.사용자에게 문제 개수 입력 받기
	public static int setQuestionTotal(Scanner scanner) {
		System.out.println("How many questons would you like?");
		int total = scanner.nextInt();
		System.out.printf("\nOkay, we are going to have %d questions. Let's go!\n", total);
		System.out.println("=".repeat(50));
		return total;
	}// method
	
//3.숫자 생성하기
	public static int setNumber(int digit) {
		// 1.apply digits
		int figure = 0;

		switch (digit) {
		case 1:
			figure = 10;
			break;
		case 2:
			figure = 100;
			break;
		}// switch
		
		// 2.create a number
		int num = (int) (Math.random()*figure);

		// 3.set the number not to be 0 or 1
		boolean isValid=true;
		while (isValid) {
			if (num == 0 || num == 1) {
				num = (int) (Math.random() * figure);
			} else
				isValid = false;
		} // while
		
		return num;
	}


//4.문제 생성 + 답안 확인
	public static int generateQuestions(Scanner scanner, int num1, int num2, int point) {
		System.out.printf("%d X %d = ?\n",num1,num2);
		int input = scanner.nextInt();
		
		if(num1*num2==input){	
			System.out.println(input + " is correct.\n");
			point++;
		}else{
			System.out.println(input + " is not correct.");
			System.out.println("The correct answer is \"" + num1 * num2 + "\"\n");
		}
		return point;
	}// method

//5.결과 보여주기
	public static void showResult(int point, int total) {
		if(point==total) {
			System.out.println("=".repeat(40));
			System.out.print("You got all the questions right!");
		}else {
			System.out.println("=".repeat(40));
			System.out.printf("You got %d out of %d questions right!\n", point, total);
		}
	};
	
}//class
	

