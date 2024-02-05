package thread_clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock implements Runnable {

	@Override
	public void run() {
		System.out.println("방법1-1");
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				
				LocalDateTime localDateTime = LocalDateTime.now();
				String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
				System.out.println("[1-1] "+localDateTimeFormat1);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}//method
	
}//class