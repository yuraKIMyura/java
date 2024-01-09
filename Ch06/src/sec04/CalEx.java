package sec04;

public class CalEx {
	
	//객체의 껍데기를 가지고 있는 것이 cal이기 때문에 우리는 cal을 객체라고 부르지만 실제로는 heap에 있어서 눈에 보이지 않아요!

	public static void main(String[] args) {
		Cal.sx = 500;
		
		Cal cal = new Cal();
		cal.power();
		cal.x = 100;
		cal.printX(150);
	}

}
