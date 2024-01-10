//240110 Class 객체 생성 및 활용 
package sec05;

public class Circle {
	private int radius;
	private String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
