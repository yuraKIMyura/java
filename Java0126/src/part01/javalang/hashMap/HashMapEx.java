//6 HashMap
package part01.javalang.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("김",95);
		map.put("이",90);
		map.put("박",85);
		System.out.println(map.get("이")); //true
		System.out.println(map.containsKey("성")); //false
		System.out.println(map.get("최")); //null
		map.putIfAbsent("최", 80);
		System.out.println(map.get("최")); //true
		System.out.println(map.containsValue(00)); //false
		System.out.println(map.toString());

		
	}//main
	
}//class
