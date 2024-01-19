//1 interface wrap-up
package part01.interWrapup;

public class SoundableEx {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		
		printSound(new Dog());
		
		Soundable dog = new Dog();
		printSound(dog);
		
		Soundable cat = new Cat();
		printSound(cat);
		
	}

}
