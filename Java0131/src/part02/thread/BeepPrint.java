package part02.thread;

public class BeepPrint {

	public static void main(String[] args) {
		
		
		for (int i=0; i<5; i++) {
			System.out.println("BEEP BEEP BEEP BEEP BEEP");
			try {
				Thread.sleep(1000); 
				//실행을 1초 간 잠시 멈춤
				//sleep() method는 Thread class에 있는 거라서 그냥 쓴 거임.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//for
		
		for (int i=0; i<5; i++) {
			System.out.println("삐 삐 삐 삐 삐");
			try {
				Thread.sleep(500); 
				//실행을 0.5초 간 잠시 멈춤
				//sleep() method는 Thread class에 있는 거라서 그냥 쓴 거임.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//for
		
		
	}//main

}//class
