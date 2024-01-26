//240124 Feedback: field에 private 지정해주기
package part02.jdbc.jan23ref;

public class Employee {

	private int empno;
	private String ename;
	private double sal;
	
	public Employee(int empno, String ename, double sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
