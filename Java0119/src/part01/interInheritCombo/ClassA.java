//3 Inheritance + Interface combo 
package part01.interInheritCombo;

interface InterA{
	void method();
}

class ClassB implements InterA{

	@Override
	public void method() {
		
	}
	
}

//classA가 classB extends하므로 classA는 classB의 모든 것을 사용 가능
//그렇기 때문에 classB가 구현한 interface도 classA가 사용 가능
public class ClassA extends ClassB{
	
	public static void main (String ...args) {
		InterA ita = new ClassA();
	}

}
