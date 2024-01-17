//5 instanceof, excplicit type casting
package part1.practice4;

public class InstanceofEx {

	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method2(parentA);
		
		Parent parentB = new Parent();
		if (parentB instanceof Child) {
			method2(parentB);
		} else {
			System.out.println("변환불가");
		}
		
	}//main
	
	// 여기서 헷갈리지 말 것: 매개변수의 type이 Parent인 것이지, instance도 Parent라는 것이 아님.
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("변환가능");
	}

}
