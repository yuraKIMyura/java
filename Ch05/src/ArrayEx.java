//240108 배열 선언 형태 암기, .length()와 .length의 차이
public class ArrayEx {

	public static void main(String[] args) {
		
		//선언 형태
		int[] scores = new int[3];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		String[] names = new String[5];
		
		System.out.println(scores); //result: memory address/reference
		System.out.println(scores.length);

		System.out.println(names); //result: memory address/reference
		System.out.println(scores.length);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		//System.out.println(scores[3]);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
