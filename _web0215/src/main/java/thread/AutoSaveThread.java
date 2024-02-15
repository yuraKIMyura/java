package thread;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용 저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}

	}

	
	
}
