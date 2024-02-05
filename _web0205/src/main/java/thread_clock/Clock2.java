package thread_clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;

public class Clock2 implements Runnable {
	
	JFrame jf; 
	
	public Clock2(JFrame jf) {
		this.jf = jf;
	}


	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				
				LocalDateTime localDateTime = LocalDateTime.now();
				String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
				jf.setTitle(localDateTimeFormat1);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}//method
	
}//class