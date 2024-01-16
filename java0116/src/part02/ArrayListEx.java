//3 ArrayList, Generic(type parameter), object ArrayList
package part02;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	private double cs;
	private int age;
	
	public Student(String name, int age, double cs) {
		super();
		this.name = name;
		this.age = age;
		this.cs = cs;
	}

	@Override
	public String toString() {
		return name + "(" + age +"세) [cs:" + cs + "점]";
	}
	
}

public class ArrayListEx {

	
	public static void main(String args[]) {
	
		String[] array = new String[100]; //고정형
		ArrayList<String> arrayList = new ArrayList<String>(); //가변형
		List<String> list = new ArrayList<>(); //축약형 (type parameter가 같으므로 뒤는 생략)
			//List가 ArrayList의 superclass이므로 위와 같은 표현이 가능함
			//List collection에는 ArrayList, LinkedList가 포함되어 있음
		
//		list.add("김하나");
//		list.add("김두리");
//		list.add("김서이");
//		for (String str : list) {
//			System.out.println(str);
//		}
//		
//		System.out.println("-".repeat(20));
//		
//		list.set(1, "차두리");
//		for (String str : list) {
//			System.out.println(str);
//		}
//		
//		System.out.println("-".repeat(20));
//
//		boolean isThere = list.contains("김너이");
//		System.out.println(isThere);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("전승민", 13, 62.5));
		studentList.add(new Student("한광훈", 19, 43.3));
		studentList.add(new Student("서이준", 8, 96.5));
		studentList.add(new Student("송선이", 22, 100));
		for (Student s : studentList) {
			System.out.println(s);
		}
		
	}
	
}
