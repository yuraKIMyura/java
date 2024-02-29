package prop;

public class MakeObj {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//얘는 클래스가 같은 패키지 내에 있어야 한다. 		
		Aaa obj = new Aaa();
		obj.aaaprint();
		
		
		//클래스 이름을 문자열로 줘서 다른 패키지에 있어도 데리고 올 수 있다.
		Class<?> handlerClass = Class.forName("prop.Aaa"); //prop.Aaa 있는지 없는지 확인, 있으면 진행
		//<?> Type이 뭐여도 상관이 없다는 것임
        Aaa handlerInstance = (Aaa) handlerClass.newInstance(); //newInstance()는 depricated 될 예정이야
        //newInstance()는 new 클래스명()하는 것과 같다는 것임
        handlerInstance.aaaprint();
	}

}
