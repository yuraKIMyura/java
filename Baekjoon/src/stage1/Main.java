//240104
//class 이름은 Main으로 바꿀 것
package stage1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int y = Integer.parseInt(scanner.next());
		int x = Integer.parseInt(scanner.next());
		int z = Integer.parseInt(scanner.next());
		if(y>=1000 && y<=3000) {
			System.out.println(y-543);
		}else {
			System.out.println("");
		}
		scanner.close();
		
	}

}
