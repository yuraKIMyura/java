//4 StringBuilder - append(), String - add()
package part02.StringEx;

public class StringEx {

	public static void main(String[] args) {
		
		String aaa = "aaa";
		String bbb = "bbb";
	
	//1번 방법	
		StringBuilder sb = new StringBuilder();
		sb.append(aaa);
		sb.append(bbb);
		System.out.println(sb);
		
	//2번 방법	
		String str = aaa + bbb;
		System.out.println(str);
		
	//3번 방법	
		String str1 = aaa.concat(bbb);
		System.out.println(str1);
		
	}//main

}//class
