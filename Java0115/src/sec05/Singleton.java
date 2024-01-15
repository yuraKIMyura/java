package sec05;

public class Singleton {

	private static Singleton singleton = new Singleton();
	//변수는 static, heap 영역에 존재함.
	
	private Singleton() {}
	//생성자가 private. 객체 추가 생성 불가.
	
	static Singleton getInstance() {
		return singleton;
	}
	

}//class
