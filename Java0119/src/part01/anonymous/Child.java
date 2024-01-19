//5 익명객체(1)
package part01.anonymous;

class Parent{
	
	void method() {}
	
}//superclass

public class Child extends Parent{
	
	void methodChild() {}

	public static void main(String[] args) {
		
		//익명 객체
		new Child(); //Child instance
		new Parent(); //Parent instance
		
		//익명의 자식 객체
		//Parent의 익명 subclass의 instance임
		//Point: an anonymous subclass of Parent is created and instantiated, but it is not an instance of Child. 
		//It's an unnamed (anonymous) class that extends 'Parent'
		new Parent() {

			//나의 해설: Parent()하면 본인 class의 instance인데, 본인의 method를 override하고 있어
			//정답 해설: 그게 포인트임! subclass가 아니면 override를 할 수 없음!
			@Override
			void method() {
				super.method();
			}
			
		};

		
	}

}//subclass
