package exam04;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		Iterator<String> iterateSet = set.iterator();
		while(iterateSet.hasNext()) {
			String str = iterateSet.next();
			System.out.println(str);
		}
		
		
		//sequential data traversal
		for(String e : set) {
			System.out.println(e);
		}
		
//		int size = set.size();
//		System.out.println("총 객체수: " + size);
//		
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			System.out.println("\t" + element);
//		}
//		
//		set.remove("JDBC");
//		set.remove("iBATIS");
//		
//		System.out.println("총 객체수: " + set.size());
//		
//		for(String element : set) {
//			System.out.println("\t" + element);
//		}
//		
//		set.clear();		
//		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}//main
}//class

