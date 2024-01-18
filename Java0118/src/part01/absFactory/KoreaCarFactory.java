//2
package part01.absFactory;

public class KoreaCarFactory extends CarFactory{

	@Override
	public TireFactory createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorFactory createDoor() {
		return new KoreaDoorProduct();
	}

}//class
