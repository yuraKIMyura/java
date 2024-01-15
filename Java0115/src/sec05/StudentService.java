//240115 Singleton Practice
package sec05;

public class StudentService {
	
	Student student = new Student();

	private static StudentService studentService = new StudentService();
	
	private StudentService(){}
	
	public static StudentService getInstance() {
		return studentService;
	}
	
	
}//class
