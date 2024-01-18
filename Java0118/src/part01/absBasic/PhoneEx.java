//1 ABSTRACT 추상클래스는 객체 생성이 불가
//반드시 subclass의 constructor에서 super 호출 필요
//반드시 subclass의 abstract method override 필요(안 할 거면 subclass도 abstract class하기)
package part01.absBasic;

public class PhoneEx {

	public static void main(String[] args) {
		
		Phone phone = new SmartPhone3(1);
		//부모 field는 사용 가능, 자식 field는 사용 불가
		System.out.println(phone.x);
		Phone phone2 = new SmartPhone2(2);
		
		//explicit type casting(강제형변환)
		SmartPhone sp = (SmartPhone) phone;
		SmartPhone2 sp2 = (SmartPhone2) phone2;
		
		if (phone2 instanceof SmartPhone) {
			SmartPhone sp3 = (SmartPhone) phone2;
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}//main

}//class
