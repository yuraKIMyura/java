//2
package part01.absFactory;

public class KoreaCarFactory extends CarFactory{

	@Override
	public TireProduct createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreaDoorProduct();
	}

}//class
