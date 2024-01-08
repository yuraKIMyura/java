//240105 return 개념, 각 method는 다른 memory를 차지한다
package sec01;

public class MethodExercise {

	public static void main(String[] args) {
		String str = input();
		System.out.println(str);
	}
	
	public static String input() {
		String str = "aaa";
		return str;
	}

}
