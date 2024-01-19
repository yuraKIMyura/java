//4
package part01.interExercise;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql select");		
	}

	@Override
	public void insert() {
		System.out.println("MySql insert");		
	}

	@Override
	public void update() {
		System.out.println("MySql update");		
	}

	@Override
	public void delete() {
		System.out.println("MySql delete");		
	}


}
