package thread;

public class MovieThread extends Thread{
	
	public MovieThread() {
		this.setName("Movie");
	}

	@Override
	public void run() {
		System.out.println("-----동영상을 재생합니다.-----");
		System.out.println("movie thread 이름: " + this.getName());
		for(int i=0; i<3; i++) {
			System.out.println("동영상"+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("동영상 thread 오류 발생");
			}
		}
		System.out.println("-----동영상 종료-----");
	
	}

	
	
}
