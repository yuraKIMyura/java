//240105 break와 continue 차이
package sec01;

public class BreakExercise1 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i==55) {
				break;//루프를 완전히 탈출
			}
			System.out.println(i);// result:1-54
		}
		System.out.println("종료");
		
		
		for(int i=1; i<=100; i++) {
			if(i==55) {
				continue;//여기를 패스
			}
			System.out.println(i);// result:1-100
		}
		System.out.println("종료");
		
		int i = 1;
		for(; i<=100; i++) {}
		System.out.println(i);// result:1-100
		System.out.println("종료");
		
	}//main

}
