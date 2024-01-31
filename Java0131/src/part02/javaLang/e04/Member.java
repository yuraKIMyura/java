package part02.javaLang.e04;

public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = id+": "+name;
		return str;
	}

}//class
