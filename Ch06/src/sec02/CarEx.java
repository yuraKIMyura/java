//240109 06-2필드 기본생성자와 생성자선언
package sec02;

public class CarEx {

	public static void main(String[] args) {
		
		Car car1 = new Car();// 이건 '기본생성자'를 부르는 게 아니라 '생성자'를 부르는 것
		car1.company = "Peugeot";
		car1.model = "Citroen";
		car1.color = "Teal";
		car1.maxSpeed = 200;
		
		System.out.println(car1);
		System.out.println(car1.toString());
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car();
		System.out.println(car2);
		
		Car car3 = new Car("Hyundai");
		System.out.println(car3);
		
		Car car4 = new Car("Lamborghini", "Huracan", "Green", 300);
		System.out.println(car4);
	}

}
