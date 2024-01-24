package part01.jdbc;

public class Employee {

//field	
	private int empno;
	private String ename;
	private double sal;
	
//constructor	
	public Employee(int empno, String ename, double sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

//getter
	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public double getSal() {
		return sal;
	}

//toString
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}//class
