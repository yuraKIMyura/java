//240112 클래스 내부/외부에서의 메소드 호출

package sec01;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();
		myCalc.plus(1, 0);
	}

}
