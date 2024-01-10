//240110 PDF Class 객체 생성 및 활용 

package sec05;

public class CircleEx {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.setRadius(10);
		pizza.setName("자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.getName()+"L의 면적은 "+area);
		
		pizza.setRadius(7);
		area = pizza.getArea();
		System.out.println(pizza.getName()+"M의 면적은 "+area);
		
		pizza.setRadius(5);
		area = pizza.getArea();
		System.out.println(pizza.getName()+"S의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.setRadius(3);
		donut.setName("자바도넛");
		area = donut.getArea();
		System.out.println(donut.getName()+"L의 면적은 "+area);
		
		donut.setRadius(2);
		area = donut.getArea();
		System.out.println(donut.getName()+"M의 면적은 "+area);
		
		donut.setRadius(1);
		area = donut.getArea();
		System.out.println(donut.getName()+"S의 면적은 "+area);

	}//main

}//class
