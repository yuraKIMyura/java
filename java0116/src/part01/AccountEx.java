//1 getter setter
package part01;

public class AccountEx {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setBalance(-100);
		acc.setBalance(50);
		System.out.println(acc.getBalance());
	}

}
