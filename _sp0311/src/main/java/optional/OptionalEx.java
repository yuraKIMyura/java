package optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {

		String str = "Hello, World";
		
		/**Optional.of() Optional type으로 바꾸는 메서드**/
		Optional<String> optionalStr = Optional.of(str);
		System.out.println(optionalStr); //result: Optional[Hello, World!]

		/**null이면 ofNullable() 메서드 사용**/
		String nullStr = null;
		Optional<String> optionalNullStr = Optional.ofNullable(nullStr);
		System.out.println(optionalNullStr); //result: Optional.empty

		/**값을 갖지 않는 빈 Optional 객체 생성**/
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional); //result: Optional.empty
		
	}//main

}//class
