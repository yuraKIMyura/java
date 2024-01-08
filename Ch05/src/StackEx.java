//240108 String 객체 참조: 동일한 문자열 리터럴을 저장하는 변수와 new("문자열")로 생성된 객체
//.length()는 String에 쓰임 .length가 array

public class StackEx {

	public static void main(String[] args) {
		int age = 32;
		String name = "강하나";
		
		//int[] intArray = null;
		//intArray[0] = 10;
		
		//String str=null;
		//System.out.println(str.length());
		
		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

	}

}
