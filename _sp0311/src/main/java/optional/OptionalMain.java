package optional;

import java.util.Optional;

class Bbb {
	int x;
	
	public Bbb (int x) {
		this.x=x;
		System.out.println("[Bbb] constructor");
	}
	
	void print() {
		System.out.println("[Bbb]");
	}
	
}

class Aaa {
	
	void print(Bbb bb) {
		bb.print();
	}
	
}

public class OptionalMain {

	public static void main(String[] args) {
		Aaa aa = new Aaa();
		Bbb bb = null;

		Optional<Bbb> bb1 = Optional.ofNullable(bb);
		System.out.println(bb1);
		System.out.println("-".repeat(20));
		
		aa.print(bb1.orElseGet(() -> new Bbb(1)));
	
	}

	

}
