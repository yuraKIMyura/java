package thread_subclass;

public class Ex04 {

	public static void main(String[] args) {

			WorkerThread workerThread = new WorkerThread();
			workerThread.start();
			
			mainTask();
			
			
	}
	
	
	public static void mainTask() {
		System.out.println("main task 시작");
		
		for(int i=0; i<5; i++) {
			System.out.println("main task 진행");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main task 끝");
	}//method

}
