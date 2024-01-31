package part02.javaLang.e678;

public class StringConvert {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		//System.out.println(intData1 instanceof String);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2 instanceof String);
	}

}
