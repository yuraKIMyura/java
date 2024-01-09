//240109 06-2필드 기본생성자와 생성자선언
package sec02;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	
	public Car() {
		System.out.println("consturtor");
	}//기본생성자는 암묵적으로 생성되는 것만을 지칭한다. 이거 생긴 건 기본생성자와 같지만 '선언된 생성자'임!
	
	public Car(String str1) {
		company = str1;
	}
	
	public Car(String str1, String str2) {
		company = str1;
		model = str2;
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company; //this는 해당 class의 속해 있음을 의미하는 '?'
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed;
	}

	
	
//	int speed;
//	int rmp;
//	
//	Body body;
//	Engine engine;
//	Tire tire;
}//class 
