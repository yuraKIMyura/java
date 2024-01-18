//1 interface - different access modifier, non-abstract methods
package part02.interImproved;

public interface InterTest {

	void test1(); //기본 추상 메소드
	
	//non-abstract method
	//method를 default로 지정하면, interface에 method를 추가해도 이 interface를 implement하는 class들에 오류가 나지 않는다.
	//default로 설정하지 않으면 추가된 method를 이 interface를 사용하는 모든 class에서 전부 다 override 해야 되기 때문이다!
	//default는 심지어 method body도 가질 수 있음!
	default void test2() {
		System.out.println("test2()");
	}
	
	//interface 내부에서만 method가 호출하는 용도
	//외부에서는 사용할 수 없기 때문이다.
	private void test3() {
		System.out.println("test3()");
	};
	
	default void test4() {
		test3();
		System.out.println("test4()");
	}
	
	//instance도 없는 interface에서 무슨 static...?
	//interface도 실체 class 객체 생성 후 사용 가능한데, 이건 그럴 필요가 없음.
	//class의 main에서 그냥 interface이름.method이름 하면 됨.
	static void test5() {
		System.out.println("test5()");
	}
	

}//class
