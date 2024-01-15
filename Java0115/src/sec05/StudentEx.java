//240115 Singleton Practice
package sec05;

public class StudentEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance();
		ss.student.name = "홍길동";
		ss.student.id = "240101";
		ss.student.kor = 100;
		ss.student.eng = 90;
		ss.student.math = 80;
		
		StudentService ss1 = StudentService.getInstance();
		System.out.println(ss.student.name);
		System.out.println(ss1.student.name);
		
		if(ss==ss1) {
			System.out.println("객체가 같다");
		}
		
		if(ss.student.equals(ss1.student)) {
			System.out.println("학생이 같다");
		}
	}

}
