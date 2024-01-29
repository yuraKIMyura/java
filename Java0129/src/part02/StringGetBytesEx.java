//3 한글은 한 글자에 3byte라는 걸 기억하세요. 영어는 1byte임.
package part02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요abc";
				
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		
		int index = str.indexOf("세요");
		System.out.println(index);

		//없으면 -1 돌려줌
		index = str.indexOf("가요");
		System.out.println(index);
			
		//String은 length(), byte은 length
		int length = str.length();
		System.out.println(length);
	
		//String object는 immutable
		String nstr = str.replace("abc", ", 감사합니다.");
		System.out.println(nstr);
		System.out.println(str);
		
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String: " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			
		}
		
	}//main

}
