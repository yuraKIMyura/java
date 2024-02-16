package practice4;

public class ThreadExample {

	
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

	}//main
	
	
	
}
