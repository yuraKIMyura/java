package lambda;

public class MyFuncEx {

	public static void main(String[] args) {

		//functional interface 구현 객체 생성할 때 이렇게 하면 된다!
		MyFunc mf = () -> System.out.println("람다");
		mf.mf();
		
	}

}
