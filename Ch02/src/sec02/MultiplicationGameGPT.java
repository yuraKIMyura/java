//240104 GPT가 다듬어준 코드
//1.SetDigit, SetNumber는 기능적으로 통합 가능
//2.SetQuestionTotal, ShowResult 통합 가능(total이 공통 변수)
package sec02;

import java.util.Scanner;

public class MultiplicationGameGPT {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit1 = setDigit(scanner);
        int digit2 = setDigit(scanner);

        int total = setQuestionTotal(scanner);
        int point = generateQuestions(scanner, digit1, digit2, total);

        showResult(point, total);
    }

    public static int setDigit(Scanner scanner) {
        System.out.println("Digits for the first number(1 or 2)?");
        return scanner.nextInt();
    }

    public static int setNumber(int digit) {
        int figure = (digit == 1) ? 10 : 100;
        int num;

        do {
            num = (int) (Math.random() * figure);
        } while (num == 0 || num == 1);

        return num;
    }

    public static int setQuestionTotal(Scanner scanner) {
        System.out.println("How many questions would you like?");
        int total = scanner.nextInt();
        System.out.printf("\nOkay, we are going to have %d questions. Let's go!\n", total);
        System.out.println("=".repeat(50));
        return total;
    }

    public static int generateQuestions(Scanner scanner, int digit1, int digit2, int total) {
        int point = 0;

        for (int i = 0; i < total; i++) {
            System.out.printf("Question %d/%d:\n", i + 1, total);

            int firstNumber = setNumber(digit1);
            int secondNumber = setNumber(digit2);

            point += checkAnswer(scanner, firstNumber, secondNumber);
        }

        return point;
    }

    public static int checkAnswer(Scanner scanner, int firstNumber, int secondNumber) {
        System.out.printf("%d X %d = ?\n", firstNumber, secondNumber);
        int input = scanner.nextInt();

        if (firstNumber * secondNumber == input) {
            System.out.println(input + " is correct.\n");
            return 1;
        } else {
            System.out.printf("%d is not correct. The correct answer is %d.\n\n", input, firstNumber * secondNumber);
            return 0;
        }
    }

    public static void showResult(int point, int total) {
        System.out.println("=".repeat(50));

        if (point == total - 1) {
            System.out.print("You got all the questions right!");
        } else {
            System.out.printf("You got %d out of %d questions right!\n", point, total);
        }
    }

}
