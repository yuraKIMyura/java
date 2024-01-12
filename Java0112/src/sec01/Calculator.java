//240112 클래스 내부/외부에서의 메소드 호출
package sec01;

public class Calculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = this.plus (x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = this.avg (7,10);
		this.println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	 
}//class
