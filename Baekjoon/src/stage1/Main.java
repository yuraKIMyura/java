//240104
//class 이름은 Main으로 바꿀 것
package stage1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = Integer.parseInt(scanner.next());
		int B = Integer.parseInt(scanner.next());
		int C = Integer.parseInt(scanner.next());
		if(A>=2 && B<=10000 && C<=10000) {
			System.out.println((A+B)%C);
			System.out.println(((A%C)+(B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
			
		}else {
			System.out.println("");
		}
		scanner.close();
		
	}

}
