package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(i -> i%2==0).forEach(i->System.out.println(i + " "));
		/*map() method*/
		list.stream().map(i -> i*2).forEach(i->System.out.print(i + " "));
		/*System.out::println*/
		list.stream().map(i -> i*2).limit(3).forEach(System.out::println);
	}

}
