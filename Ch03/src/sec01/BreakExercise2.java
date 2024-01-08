//240105 중첩문에서의 break: label 활용
package sec01;

public class BreakExercise2 {

	public static void main(String[] args) {
		Label: for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==3 && j==3) {
					break Label;
				}
				System.out.printf("(%d,%d)\n", i,j);
			}//j for
		}//i for
		//result: (3,3)부터 출력 중지
		
		System.out.println("-".repeat(30));
		
		Label: for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==3 && j==3) {
					continue Label;
				}
				System.out.printf("(%d,%d)\n", i,j);
			}//j for
		}//i for
		//result: (3,3)만 제외하고 나머지 모두 출력
	}

}
