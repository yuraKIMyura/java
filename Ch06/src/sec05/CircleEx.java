//240110 Class 객체 생성 및 활용 

package sec05;

public class CircleEx {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.setRadius(10);
		pizza.setName("자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.getName()+"의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.setRadius(2);
		donut.setName("자바도넛");
		area = donut.getArea();
		System.out.println(donut.getName()+"의 면적은 "+area);
		
	}//main

}//class
