package part02.thread;

public class BeepPrint2 {

	public static void main(String[] args) {
		
		/**run()과 start()의 차이 **/
		//run은 그냥 run method를 실행시킨 것, start는 multi-thread를 시작하는 것
		Thread thread = new Thread(new BeepTask());
		thread.start();
			
		for (int i=0; i<5; i++) {
			System.out.println("삐 삐 삐 삐 삐");
			try {
				Thread.sleep(1000); 
				//실행을 0.5초 간 잠시 멈춤
				//sleep() method는 Thread class에 있는 거라서 그냥 쓴 거임.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//for
		
		System.out.println("메인 끝");
	}//main

}//class
