package part01.nestedInter;

import java.util.Scanner;

public class ButtonExample {

	public static void main (String ...strings ) {
		Scanner scan = new Scanner(System.in);
		Button btn = new Button();
		Button.onClickListener listener = null;
		System.out.println("1전화 2메시지");
		
		String str = scan.nextLine();
		switch(str){
			case "1" : 
				listener = new CallListener();
				break;
			case "2" : 
				listener = new CallListener();
				break;
			default :
				return;
		}
	}
	
	
}
