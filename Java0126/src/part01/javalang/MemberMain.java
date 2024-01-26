//2 equals(), hashCode(), toString() method
//equals()와 hashCode() 재정의를 통한 instance 동일성 판별 기준 수립
package part01.javalang;

public class MemberMain {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println("toString "+"-".repeat(20));
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		
		System.out.println("\ndefault toString "+"-".repeat(20));
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println("\nhashcode "+"-".repeat(20));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("\nequals "+"-".repeat(20));
		if(obj1.equals(obj2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		//expectation
		//같다
		//다르다
		
		//result
		//다르다
		//다르다
		
		//equals()method 재정의 후 result
		//같다
		//다르다
		
	}//main

}//class
