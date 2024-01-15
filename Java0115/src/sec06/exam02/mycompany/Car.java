//240115 package hierarchy 구성, import, main method(static method & class instance)
package sec06.exam02.mycompany;

//import sec06.exam02.hyundai.*; *는 모든 class를 import하는 것인데, 전체 class가 엄청 많으면 문제가 된다.
import sec06.exam02.hyundai.Engine;
import sec06.exam02.hankook.SnowTire;
import sec06.exam02.kumho.BigWidthTire;

public class Car {

	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	

//에러 발생 이유: main method는 static method이기 때문에, instance를 사용하려면 object를 먼저 생성하고 이를 사용해야 한다
//에러 해결: 위의 코드를 main method로 다 넣어버리면 object 생성이 되기 때문에 오류 해결!
//	public static void main(String args[]) {
//		System.out.println(engine);
//		System.out.println(tire1);
//		System.out.println(tire2);
//		System.out.println(tire3);
//		System.out.println(tire4);
//	}
	
}//class
