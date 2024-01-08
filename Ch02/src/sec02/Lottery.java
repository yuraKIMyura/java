//240103 Math.random(), 중복 확인 검사
//240104 do-while 활용 새로운 코드
package sec02;

public class Lottery {

//My original code는 아래에 있음
//do-while 사용한 코드를 보자
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*45+1);;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		
		do {
			num2 = (int)(Math.random()*45+1);
		} while (num2 == num1);
		
		do {
			num3 = (int)(Math.random()*45+1);
		} while (num3 == num2 || num3 == num1);
		
		do {
			num4 = (int)(Math.random()*45+1);
		} while (num4 == num3 || num4 == num2 || num4 == num1);
		
		do {
			num5 = (int)(Math.random()*45+1);
		} while (num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1);
		do {
			num6 = (int)(Math.random()*45+1);
		} while (num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1);
		
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
	}
	
//1.My code	
//	public static void main(String[] args) {
////Math class: Math.PI
//		//System.out.println(Math.PI);
//
////로또 번호 생성기		
////Math.random(): 0과 같거나 크고 1보다 작은 값들이 생성됨
//		
//		//outline
//		//1. 6개의 정수를 생성
//		//2. 6개의 정수를 비교 (1,2,3,4,5번까지)
//		//3. 같은 번호가 나오면 그 중 하나를 재생성, 나머지와 다시 비교 > 반복
//		
//		int num1 = (int)(Math.random()*45+1);
//		int num2 = (int)(Math.random()*45+1);
//		int num3 = (int)(Math.random()*45+1);
//		int num4 = (int)(Math.random()*45+1);
//		int num5 = (int)(Math.random()*45+1);
//		int num6 = (int)(Math.random()*45+1);
//		
//		boolean isRepeated = true;
//		
//		while(isRepeated) {
//			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) {
//	            System.out.println("Repeated number 1: " + num1);
//	            num1 = (int) (Math.random()*45+1);
//			} else if (num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) {
//				System.out.println("Repeated number 2: " + num2);
//				num2 = (int) (Math.random()*45+1);
//			} else if (num3 == num4 || num3 == num5 || num3 == num6) {
//				System.out.println("Repeated number 3: " + num3);
//				num3 = (int) (Math.random()*45+1);
//			} else if (num4 == num5 || num4 == num6) {
//				System.out.println("Repeated number 4: " + num4);
//				num4 = (int) (Math.random()*45+1);
//			} else if(num5 == num6) {
//				System.out.println("Repeated number 5: " + num5);
//				num5=(int) (Math.random()*45+1);
//			} else {
//				isRepeated=false;
//			}
//		}//while
//
//		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
//		
//	}//main

}//class
