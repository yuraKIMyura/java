//3 exit()
package part01.javalang;

public class Exit {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(0);
				//break;
			}
		}//for
		System.out.println("마무리 코드");
	}//main

	
}//class
