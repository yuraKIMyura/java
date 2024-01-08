//240104 삼항자
package sec01;

public class TertiaryExercise {

	public static void main(String[] args) {
		int score = 75;
		char grade = (score>90) ? 'A' : 'B';
		System.out.println(grade);
		
		String level = (score>90) ? "Advanced" : (score>80) ? "Intermediate" : "Novice";
		System.out.println(level);
	
		int top = 5;
		int bottom=10;
		int height = 7;
		double area = (top+bottom)*height/2;
		System.out.println(area);
		
		
	}//main

}
