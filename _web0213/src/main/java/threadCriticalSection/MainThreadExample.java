package threadCriticalSection;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		

//		Calculator calculator1 = new Calculator();
//		Calculator calculator2 = new Calculator();
//		
//		ser1 user1 = new User1();
//		user1.setCalculator(calculator1);
//		user1.start();
//		
//		User2 user2 = new User2();
//		user2.setCalculator(calculator2);
//		user2.start();
		
	}

}
