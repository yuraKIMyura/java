//2 interface + polymorphism
package part01.interPolymor;

import java.util.ArrayList;
import java.util.List;

class Acc{
	int x;
	String method() {
		return "문자열";
	}
}

public class VehicleEx {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		Bus bus = new Bus();
		//Bus는 Vehicle, Bus type 모두 가능함.
		//하지만 declare된 type에 의해서 접근 가능한 member의 범위가 정해짐
		//vehicle.checkFare();
		((Bus)vehicle).checkFare();
		bus.checkFare();
		
//Interface + Polymorphism		

		//Generic을 Bus로 잡아두면 type이 Vehicle인 변수는 넣을 수 없음
		//List<Bus> list = new ArrayList<>();
		//list.add(vehicle);
		//list.add(bus);
		
		//Generic을 Vehicle로 잡아두면, 이 interface를 implement하는 모든 class의 instance를 넣을 수 있음
		List<Vehicle> list = new ArrayList<>();
		list.add(vehicle);
		list.add(bus);
		
		//이건 안 좋은 방식 generic이 <Object>면 list element의 type을 알 수가 없음
		List<Object> list2 = new ArrayList<>();
		list2.add(123);
		list2.add("문자열");
		list2.add(3.14);
		list.add(new Bus());
		
		for(Object obj : list2) {
			if(obj instanceof String)
			System.out.println(obj);
		}
		
		
		List<Acc> list3 = new ArrayList<>();
		list3.add(new Acc());
		
		for(Object obj : list3) {
			Acc acc = (Acc) obj;
			System.out.println(acc);
		}
		
		
	}//main

}//class
