package thread;

public class PrintThread extends Thread{

	private boolean stop; 
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");		
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	
	
}
