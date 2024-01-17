//1 abstract class vs abstract method
package part2.practice1;

public abstract class Animal {
	
	public String species;
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
//추상메소드 선언
	public abstract void sound();

}
