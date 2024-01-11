//240111 method의 return: 실제로는 void도 return;이 생략되어 있는 형태.
//모든 함수는 호출되고 실행이 완료되면 호출되었던 위치로 return 해야 한다.
package sec01;

public class Passing1 {

	public static void main(String[] args) {
		int x = 100; //local variable
		int num = method1(x);
		System.out.println(num);
	}
	
	public static int method1(int y) {
		y++;
		return y;
	}
	

}
