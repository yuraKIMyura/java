package thread_clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
	
		/**[1-1] Thread class로부터 직접 생성 + Runnable 구현class생성**/
		Thread thread1 = new Thread(new Clock());
		thread1.start();
		
		/**[1-2] Thread class로부터 직접 생성 + Runnable 익명구현객체 **/
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("방법1-2");
				for(int i=0; i<5; i++) {
					try {
						Thread.sleep(1000);
						
						LocalDateTime localDateTime = LocalDateTime.now();
						String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
						System.out.println("[1-2] " + localDateTimeFormat1);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}//for
			}//method
		});
		thread2.start();

	}//main

}
