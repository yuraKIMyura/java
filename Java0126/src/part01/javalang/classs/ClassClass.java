//5 Class class
package part01.javalang.classs;

class Car{ }

public class ClassClass {

	public static void main(String[] args) {
		
	//방법1
		Class<? extends Car> clazz = Car.class;
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		System.out.println("-".repeat(30));
		
	//방법2
		try {
			Class clazz2 = Class.forName("part01.javalang.classs.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackageName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("-".repeat(30));
		
	//방법3
		Car car = new Car();
		Class<? extends Car> clazz3 = car.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
	
		System.out.println("-".repeat(30));
		
	//클래스를 활용해서 절대경로 얻기
		String absPath1 = clazz.getResource("photo1.jpg").getPath();
		System.out.println(absPath1);
		
		String absPath2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(absPath2);
		
	}//main
	
}//class
