//240104 method 생성 연습: static method와 method 분리
package sec04;

import java.util.Scanner;

public class InputMethod {

//1.정적메소드: 함수만 달랑 불러서 쓸 수 있음	
	public static void sum(Scanner scanner) {
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}//method sum
	
	public static void multi(Scanner scanner) {
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}

//2.위의 내용 한꺼번에 나오게 만들기	
	public static void both(Scanner scanner) {
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int resultSum= num1 + num2;
		System.out.println("덧셈 결과:" + resultSum);
		int resultMulti = num1 * num2;
		System.out.println("곱셈 결과:" + resultMulti);
	}

	
//3.입력, 결과 method 분리	
	public static int input(Scanner scanner) {
		System.out.print("수:");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		return num;
	}
	
	public static void result(int num1, int num2) {
		int resultSum= num1 + num2;
		System.out.println("덧셈 결과:" + resultSum);
		int resultMulti = num1 * num2;
		System.out.println("곱셈 결과:" + resultMulti);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//sum(scanner);
		//multi(scanner);
		//both(scanner);
		
		System.out.print("첫번째 ");
		int num1 = input(scanner);
		
		System.out.print("두번째 ");
		int num2 = input(scanner);
		
		result(num1, num2);
	}//main

}//class
