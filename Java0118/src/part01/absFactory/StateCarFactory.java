//2
package part01.absFactory;

public class StateCarFactory extends CarFactory{

	@Override
	public TireFactory createTire() {
		return new FrenchTireProduct();
	}

	@Override
	public DoorFactory createDoor() {
		return new StateDoorProduct();
	}
	
}//class
