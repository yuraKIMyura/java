package thread;

public class MusicRunnable implements Runnable {
	
	public MusicRunnable() {
		/**The setName method is part of the Thread class, not the Runnable interface.**/
		//this.setName("music");
	}

	@Override
	public void run() {
		System.out.println("-----음악을 재생합니다.-----");
		//System.out.println(this.getName());
		for(int i=0; i<3; i++) {
			System.out.println("음악"+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("음악 thread 오류 발생");
			}
		}
		System.out.println("-----음악 종료-----");

		
	}
	
	

}
