//1 superclass constructor
package part02;

public class Child extends Parent{
	
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.name = name; //redundant하므로 없애는 게 낫다
		this.studentNo = studentNo;
	}

}
