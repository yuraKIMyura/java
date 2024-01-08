//240104
package sec01;

public class LoopExercise {

	public static void main(String[] args) {

//1.for
		System.out.println("for loop");
		for(int i=0; i<10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("");
		
//2.while
		System.out.println("\nwhile loop");
		int i=0;
		while(i<10) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println("");

//3.for를 while처럼 쓰기
		System.out.println("\nfor를 while처럼");
		int k=0;
		for(;k<10;k++) {
			System.out.printf("%d ", k);
		}
		System.out.println("");
		
		int l=0;
		for(;;) {
			if(l>=10) {
				break;
			}
			System.out.printf("%d ", l);
			l++;
		}
		System.out.println("");
		
//4.do-while: do block을 무조건 한 번은 실행
		System.out.println("\ndo-while loop");
		int j=0;
		do {
			System.out.printf("%d ", j);
			j++;
		}while(j<10);
		System.out.println("");
		
	}

}
