//240112 void와 return
package sec01;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas 충분");
		} else {
			System.out.println("gas 주입 필요");
		}
		
	}

}
