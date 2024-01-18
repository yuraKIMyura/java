//today's final challenge
//TODO->DONE 240116 17:40 work on setBalance method
//240117 14:30 worked on deposit/withdraw method
package part03;

import java.io.Serializable;

public class Member implements Serializable {
	
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

	public void setBalance(int amount, char transaction) {
		
		switch(transaction){
		case 'd':
			if(amount<=0) {
				System.out.println("예금액은 0원 이하일 수 없습니다.");
			}else {
				balance += amount;
				System.out.println("예금 후 잔고: " + balance +"원");
			}
			break;
		case 'w':	
			if(amount<=0) {
				System.out.println("출금액은 0원 이하일 수 없습니다.");
			}else if(amount>balance){
				System.out.println("잔고보다 많은 금액은 출금할 수 없습니다.");
				System.out.println("현재 잔고: " + balance +"원");
			}else {
				balance -= amount;
				System.out.println("출금 후 잔고: " + balance +"원");
			}
			break;
		}
		
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
