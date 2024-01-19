//2 interface + polymorphism
package part01.interPolymor;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 달린다");		
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크한다");
	}

}//class
