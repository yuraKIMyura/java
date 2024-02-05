package thread_class;

public class Ex02 {

	public static void main(String[] args) {
		
		/**Synchronous**/
		Task task = new Task();
		task.run();
		
		/**Asynchronous**/
		Thread thread = new Thread(task);
		thread.start();
		
		mainTask();
		
		
	}//main
	
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

}//class
