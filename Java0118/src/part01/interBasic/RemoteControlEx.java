//3 interface
package part01.interBasic;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		//interface도 polymorphism 가능	
		RemoteControl rc = new Audio();
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
	
	}

}//class
