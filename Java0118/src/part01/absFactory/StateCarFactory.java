//2
package part01.absFactory;

public class StateCarFactory extends CarFactory{

	@Override
	public TireProduct createTire() {
		return new FrenchTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new StateDoorProduct();
	}
	
}//class
