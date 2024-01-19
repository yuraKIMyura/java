//4
package part01.interExercise;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle select");		
	}

	@Override
	public void insert() {
		System.out.println("Oracle insert");		
	}

	@Override
	public void update() {
		System.out.println("Oracle update");		
	}

	@Override
	public void delete() {
		System.out.println("Oracle delete");		
	}

}
