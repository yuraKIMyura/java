//240109 06-4메소드
package sec04;

public class Cal {

	static int sx;
	int x;
	
//static 사용하지 않아요!
//static을 쓰면 객체 생성 없이 method를 쓸 수 있으니까요!
	void power() {
		System.out.println("전원을 켭니다");
		System.out.println("sx: " + sx);
	}
	
	void printX(int x) {
		System.out.println(x);
	}
}
