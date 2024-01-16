//240116 getter setter
package part01;

public class Account {

	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		//balance가 0이하일 경우에는 반영하지 않는다는 의미의 code
		//이거 사실 deposit이 0이하일 경우라고 설정해야 맞는 건데 선생님 헷갈리신 것 같음
		if(balance > 0) {
			this.balance = balance;
		}
	}
	
}//class
