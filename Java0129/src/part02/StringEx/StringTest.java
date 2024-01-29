//5 연산시간비교
package part02.StringEx;

public class StringTest {

	public static void main(String[] args) {

		//방법1
			StringBuilder sb = new StringBuilder();
			
			long time1 = System.currentTimeMillis();
			for (int i=0; i<100000; i++) {
				sb.append("a");
			}
			long time2 = System.currentTimeMillis();
			
			System.out.println("연산시간 : " + (time2-time1) + " msec");
		
		
		//방법2
			String str = "";
			
			long time3 = System.currentTimeMillis();
			for (int i=0; i<100000; i++) {
				str += "a";
			}
			long time4 = System.currentTimeMillis();
			
			System.out.println("연산시간 : " + (time4-time3) + " msec");
	
		
		//방법3
			String str2 = "";
			
			long time5 = System.currentTimeMillis();
			for (int i=0; i<100000; i++) {
				str2 = str2.concat("a");
			}
			long time6 = System.currentTimeMillis();
			
			System.out.println("연산시간 : " + (time6-time5) + " msec");
		
		
	}//main

}//class
