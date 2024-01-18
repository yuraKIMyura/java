//2 Inheritance: syntax, instanceof
package part01;

class Parent{
	
	int money = 100;
	
	void disp() {
		System.out.println(money);
	}
	
}//class


public class Child extends Parent{
	
	public Child() {
		//Parent  class로부터 상속 받은 money field를 본인 것처럼 사용
		//심지어 Child class에서는 money field declare도 안 되어 있음
		this.money += 300;
	}

	public static void main(String[] args) {
		Child child1 = new Child();
		//System.out.println("Child type: " + child1.money);
		child1.disp();
		System.out.println(child1 instanceof Parent); //result: true
		System.out.println(child1 instanceof Child); //result: true
		
		Parent child2 = new Child();
		//System.out.println("Parent type: " + child2.money);
		child2.disp();
		System.out.println(child2 instanceof Parent); //result: true
		System.out.println(child2 instanceof Child); //result: true
	}

}//class
