//3 Inheritance constructor
package part01;

public class Student extends People{

	String hakbun;
	
	Student(){
		System.out.println("Student(Child constructor)");
	}
	
	Student(String hakbun){
		super();
		this.hakbun = hakbun;
		System.out.println("Student(Child constructor w/ hakbun)");
	}
	
	public static void main(String args[]) {
		Student student1 = new Student();
		Student student2 = new Student("2024");
	}

	//cannot reduce visibility of inherited method
//	@Override
//	private void method1() {
//		super.method1();
//	}

	
	
}
