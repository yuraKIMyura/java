//3 polymorphism 매개변수의 다형성
package part1.practice2;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle object는 아직 생성되었지 않았지만 it works!
	}
	
}
