package thread;

public class SleepExample {

	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for
		System.out.println("끝");
	
	}//main

}//class
