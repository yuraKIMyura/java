//2 Abstract Factory Pattern과 다형성
package part01.absFactory;

import java.util.Scanner;

public class FactoryEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("1.국산차 2.미국차");
		String key = scanner.nextLine();
		switch(key) {
		case "1" : 
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요.");
			break;
		}
		
		TireFactory tireProduct = carFactory.createTire();
		DoorFactory doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.Assemble();
		String door = doorProduct.Assemble();
		
		System.out.println(tire);
		System.out.println(door);
		
		
//		CarFactory fac1 = new KoreaCarFactory();
//		
//		TireFactory tp1 = fac1.createTire();
//		DoorFactory dp1 = fac1.createDoor();
//		
//		String t1 = tp1.Assemble();
//		String d1 = dp1.Assemble();
//		
//		System.out.println(t1);
//		System.out.println(d1);
//
//		
//		CarFactory fac2 = new StateCarFactory();
//		
//		TireFactory tp2 = fac2.createTire();
//		DoorFactory dp2 = fac2.createDoor();
//		
//		String t2 = tp2.Assemble();
//		String d2 = dp2.Assemble();
//		
//		System.out.println(t2);
//		System.out.println(d2);
	
	}//main

}//class
