//2 p.440 연습문제 1번
package part01.anonym.ex1;

public class Main {
	
	public static void main(String[] args) {
		
		
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(new Worker() {

			@Override
			public void start() {
				System.out.println("테스트를 합니다.");
			}
			
		});
		
	}//main
	
	
	

}
