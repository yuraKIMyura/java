//3 interface
package part01.interBasic;

public interface RemoteControl {

	//interface에서는 variable 정의 불가. 다 constant임! 자동으로 public static final이 됨.
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//interface에서 정의된 method는 자동으로 public abstract임!
	public abstract void turnOn();
	void turnOff();
	
}//class
