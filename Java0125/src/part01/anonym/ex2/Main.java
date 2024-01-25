//3 p.440 연습문제 2번
package part01.anonym.ex2;

public class Main {

	public static void main(String[] args) {

		Anonymous ano = new Anonymous();
		ano.field.run();
		ano.method1();
		ano.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
			
		});
	}

}
