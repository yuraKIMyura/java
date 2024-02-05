package thread_class;

public class Ex01 {

	public static void main(String[] args) {
		
		/**Synchronous**/
		Task task = new Task();
		task.run();
		
		/**Asynchronous**/
		Thread thread = new Thread(task);
		thread.start();
		
		
	}//main

}//class
