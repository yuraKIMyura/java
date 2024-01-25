//p.435 익명객체의 로컬변수사용
package part01.anonym;

public class Anonymous {
	
	int field;
	void method(int arg1, int arg2) {
		System.out.println(arg1 +", " + arg2);
		
		/**Local variable arg1 defined in an enclosing scope must be final or effectively final**/
		//arg1 = 20;
		int var1 = 0;
		int var2 = 0;
		field = 10;
		
		Calculatable cal = new Calculatable () {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
			
		};
		System.out.println(cal.sum());
		
	}//method
	
	public static void main(String ...strings) {
		Anonymous ano = new Anonymous();
		ano.method(1, 1);
	}//main
	
}//class
