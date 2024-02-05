package thread_class;

public class Ex03 {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("시작");
				
				for(int i=0; i<5; i++) {
					System.out.println("진행");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("끝");
				
			}
			
		});
		
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
