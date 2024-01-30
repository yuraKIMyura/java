//2 Math: ceil(), floor(), rint(), round()
package part02;

public class MathEx {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-1);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		
		//가장 가까운 정수로 올림
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3);
		System.out.println(v4);
		
		//가장 가까운 정수로 버림
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5);
		System.out.println(v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.9);
		System.out.println(v7);
		System.out.println(v8);
		
		double v11 = Math.random();
		System.out.println(v11);
		
		//Round to Nearest Integer: double을 위함. 동일할 경우에는 짝수로 맞춤
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		
		//
		double v14 = Math.round(5.3);
		double v15 = Math.round(5.7);
		System.out.println(v14);
		System.out.println(v15);
	}

}
