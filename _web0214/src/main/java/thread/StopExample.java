package thread;

public class StopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printThread.setStop(true);
		
	}

}
