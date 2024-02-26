package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GetLineEx {
	
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		//Reader: 모든 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스
//		//InputStreamReader: 문자 변환 보조 스트림
//		//보조스트림: 자체적으로 입출력을 수행할 수 없기 때문에 입출력 소스와 바로 연결되는 Input/OutputStream, Reader, Writer 등에 연결하여 입출력을 수행
//		BufferedReader br = new BufferedReader(reader);
//		//Buffer: 메모리 버퍼와 작업하여 실행 성능을 향상
//		//BufferedReader: 문자 기반 입력 스트림에 연결되어 버퍼를 제공해주는 보조 스트림
		
		Scanner br = new Scanner(System.in);
		
		while(true){
			System.out.println("입력하세요: ");
//			String lineStr = br.readLine();
			String lineStr = br.nextLine();
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.println("입력된 내용: " + lineStr);
			System.out.println();
		}
		
		br.close();
		
	}

}
