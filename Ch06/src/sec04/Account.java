//240109
package sec04;

public class Account {
	String nation = "한국";
	String name;
	String SSN;
	String tel;
	int age;
	
	
	
	public Account() {
		super();
	}

	public Account(String name, String sSN, String tel, int age) {
		super();
		this.name = name;
		SSN = sSN;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Account [nation=" + nation + ", name=" + name + ", SSN=" + SSN + ", tel=" + tel + ", age=" + age + "]";
	}
	
	
}
