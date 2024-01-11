//240111 commad line
package sec01;

public class MainEx {

	public static void main(String[] ar) {
		if(ar.length != 2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0); // 프로그램 종료 명령, 0은 '정상종료' 시그널
		}
		System.out.println("1:"+ar[0]+ " 2:"+ar[1]);
	}//main

}//class
