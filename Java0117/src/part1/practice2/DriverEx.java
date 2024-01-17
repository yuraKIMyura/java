//3 polymorphism 매개변수의 다양성

package part1.practice2;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1버스 2택시");
		int num = Integer.parseInt(scanner.nextLine());
		Vehicle vehicle = null;
				switch(num) {
			case 1:
				vehicle = new Bus();
				break;
			case 2:
				vehicle = new Taxi();
				break;
			default:
				break;		
		}
		driver.drive(vehicle);
	}//main

}//class
