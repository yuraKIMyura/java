//trim()
package part02.StringEx;

public class StringTrimEx {

	public static void main(String[] args) {
		
		String str = "                           가 나   다       ";
		
		System.out.println(str);
		System.out.println(str.length());
		
		//앞뒤 공백을 삭제
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		//앞뒤 포함 가운데 공백도 삭제
		System.out.println(str.replaceAll("\\s+", ""));
		System.out.println(str.replaceAll("\\s+", "").length());
		
		String str1 = String.valueOf(10.5);
		System.out.println(str1+30);
	}

}
