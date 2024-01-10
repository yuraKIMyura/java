//240110 PDF 객체 배열 선언과 생성
package sec05;

public class ObjectArrayEx {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		for (int i=0; i<c.length; i++) {
			c[i] = new Circle();
			System.out.println(c[i]);
		}
	}

}
