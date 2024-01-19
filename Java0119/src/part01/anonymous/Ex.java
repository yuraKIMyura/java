//5 익명객체(2)
package part01.anonymous;

class AnyClass{
	void mmm() {};
}

public class Ex {

	public static void main(String[] args) {
		
		//익명의 자식 객체
		//질문: subclass가 없는데 자식 객체를 만들 수 있음? 자동으로 만들어짐?
		//AnyClass의 anonymous subclass가 만들어지고, 그것이 instantiate된 것임!
		AnyClass ac = new AnyClass() {

			@Override
			void mmm() {
				super.mmm();
			}
			
		};
		
	}
	
}
