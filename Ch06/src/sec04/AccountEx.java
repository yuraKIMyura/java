//240109
package sec04;

public class AccountEx {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.name = "김";
		acc1.SSN = "010101";
		acc1.tel="010-0000-0000";
		System.out.println(acc1);
		
		Account acc2 = new Account();
		System.out.println(acc2);
		
		Account acc3 = new Account("김승수", "020202", "02-2222-2222", 10);
		System.out.println(acc3);
	}

}
