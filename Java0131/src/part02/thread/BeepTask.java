package part02.thread;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		
		for (int i=0; i<5; i++) {
			System.out.println("BEEP BEEP BEEP BEEP BEEP");
			try {
				Thread.sleep(1000); 
				//실행을 1초 간 잠시 멈춤
				//sleep() method는 Thread class에 있는 거라서 그냥 쓴 거임.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//for
		
		System.out.println("스레드 끝");
		
	}

}
