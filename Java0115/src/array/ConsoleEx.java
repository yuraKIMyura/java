//240115 
//여기에서 실행하면 오류나니까 cmd로 실행
//D:\_dev\java\Java0115\bin>java array.ConsoleEx 실행
package array;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {

		Console console = System.console();
			//obtain a reference to the Console object from the System class
			//Console type의 변수 설정, System class의 console() method의 결과값 저장
		System.out.println("입력: ");
		String str = console.readLine();
			//Console type의 readLine() method 사용
		System.out.println("입력: ");
		str = console.readLine();
		System.out.println(Integer.parseInt(str));
		System.out.println("암호: ");
		char[] charPass = console.readPassword();
			//char array에 Console type의 readPassword() method 결과값 저장
		String strPass = new String(charPass);
			//char array를 String으로 변환
		System.out.println(strPass);
		
	}//main

}//class
