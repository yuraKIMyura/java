package thread_subclass;

public class WorkerThread extends Thread {

	@Override
	public void run() {
		
		System.out.println("시작");
		
		for(int i=0; i<5; i++) {
			System.out.println("진행");
			try {
				WorkerThread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("끝");
		
	}

}
