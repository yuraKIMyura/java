//1 nested class review: static modifier
package part01.review;

public class Account {

	class Name{}
	class School{}
	
	Name name = new Name();
	
	//Non-static inner classes are associated with an instance of the outer class, 
	//and they cannot be instantiated in a static context without an instance of the outer class.
	//그렇기 때문에 Account를 instance화하면 static School() instance도 가능함
	
	//static School school1 = new School();
	

    // Note: In this case, the School class is a non-static inner class of the Account class.
    // Instantiating an Account allows access to its inner classes, including School.
	static School school2 = new Account().new School();
	
}
