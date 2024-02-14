package thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread main = Thread.currentThread();
		System.out.println("main thread 이름: "+main.getName());
		
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.setName("Music");
		System.out.println("music thread 이름: " + thread2.getName());
		thread2.start();		
		
	}
	
}
