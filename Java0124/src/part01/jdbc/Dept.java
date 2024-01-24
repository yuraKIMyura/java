package part01.jdbc;

public class Dept{

//field	
	private int deptno;
	private String dname;
	private String loc;
	
//constructor	
	public Dept(int deptno, String dname, String loc) {
		
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
//getters
	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

//toString	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	
	
}//class
