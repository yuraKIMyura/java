package part02.jdbc;

public class Employee {

	int empno;
	String ename;
	double sal;
	
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
