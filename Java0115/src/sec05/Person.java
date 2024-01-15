//240115 static final variable initialization
//it must be initialized either (1)at the time of declaration or (2)within a static initialization block. 
package sec05;

public class Person {
	
	final static double apple;
	static double banana;
	final String name;
	
	public Person(String name, double y) {
		this.name = name;
		//Person.apple = y;
		Person.banana = y;
	}

	//static block cannot take parameters	
	static {
		
		apple = 5.0;
	}
	

}//class
