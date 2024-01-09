package sec04;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		double result1 = cal.areaRectangle(10,20);
		System.out.println(result1);
		
		double result2 = cal.areaRectangle(10);
		System.out.println(result2);
		
	}

}
