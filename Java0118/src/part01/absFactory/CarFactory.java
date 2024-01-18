//2 Abstract Factory Pattern과 다형성
package part01.absFactory;

public abstract class CarFactory {
	
	//abstract method declaration
	public abstract TireFactory createTire();
	public abstract DoorFactory createDoor();
	
}//class
