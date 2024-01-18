//1 interface - different access modifier, non-abstract methods
package part02.interImproved;

public class InterTestEx implements InterTest{

	public static void main(String[] args) {
		
		InterTest.test5();
		
		InterTest it = new InterTestEx();
		it.test1();
		
		
	}//main

	@Override
	public void test1() {
		
	}

	@Override
	public void test2() {
		//이거 없어도 돌아가는 데 문제 전혀 없음.
		//interface는 constructor가 없으니까 static 느낌으로 InterTest. 이렇게 사용
		InterTest.super.test2();
		System.out.println("overriding test2()");
	}
	
	

}//class
