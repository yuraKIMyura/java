package thread_subclass;

public class Ex05 {

	public static void main(String[] args) {

		Thread thread = new Thread() {

			@Override
			public void run() {
				System.out.println("task 시작");
				
				for(int i=0; i<5; i++) {
					System.out.println("task 진행");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("task 끝");
			}			
		};
		
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


}
