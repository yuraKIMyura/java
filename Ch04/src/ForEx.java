//240110 별찍기
public class ForEx {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			System.out.println("*".repeat(i));
		}//for
		System.out.println();

		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//for
		System.out.println();

		
		for(int i=0; i<4; i++) {
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}		
			System.out.println();
		}//for
		
	}//main

}//class
