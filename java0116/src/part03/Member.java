//today's final challenge
//240116 17:40 work on setBalance method
package part03;

public class Member {
	
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String birthday;
	private int balance;
	
//constructor
	public Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.balance = 0;
	}

//toString()	
	@Override
	public String toString() {
		return "[이름: " + name + "] [아이디: " + id+"]";
	}


//getter/setter
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	
	
	

}
