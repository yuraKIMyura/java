//2
package part01.absFactory;

public class FactoryEx {

	public static void main(String[] args) {

		CarFactory fac1 = new KoreaCarFactory();
		
		TireProduct tp1 = fac1.createTire();
		DoorProduct dp1 = fac1.createDoor();
		
		String t1 = tp1.Assemble();
		String d1 = dp1.Assemble();
		
		System.out.println(t1);
		System.out.println(d1);

		
		CarFactory fac2 = new StateCarFactory();
		
		TireProduct tp2 = fac2.createTire();
		DoorProduct dp2 = fac2.createDoor();
		
		String t2 = tp2.Assemble();
		String d2 = dp2.Assemble();
		
		System.out.println(t2);
		System.out.println(d2);

		
		
		
	}

}
