//240108 return type이 array인 method 정의할 때의 주의점
import java.util.Scanner;

public class GradesEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//getMaxAvg(setScores(scanner,setLimit(scanner)));
		double[] baseArray = setLimit(scanner);
		double[] scoreArray = setScores(scanner, baseArray);
		getMaxAvg(scoreArray);
		showScores(scoreArray);
		
	}//main
	

	//1.학생 수 입력 받고 배열 생성하는 함수
	public static double[] setLimit(Scanner scanner) {
		System.out.println("학생 수 입력 > ");
		int limit = scanner.nextInt();
		double[] studentArray = new double[limit]; 
		return studentArray;
	}
	
	//2.생성된 배열의 각 index에 값 넣는 함수
	public static double[] setScores(Scanner scanner, double[] scoreArray) {
		for(int i=0; i<scoreArray.length; i++) {
			System.out.printf("학생%d 성적 입력> \n", i+1);
			scoreArray[i] = scanner.nextDouble();
		}
		return scoreArray;
	}
	
	//3.생성된 배열의 평균과 최댓값을 구하는 함수
	public static void getMaxAvg(double[] scoreArray) {
		double max = scoreArray[0];
		double sum = 0;
		
		for(double score: scoreArray) {
			sum += score;
			
			if(score >= max) {
				max = score;
			}
		}
		
		double avg = sum/scoreArray.length;
		
		System.out.printf("최고점: %.2f점\n", max);
		System.out.printf("평균: %.2f점\n", avg);
		
	}
	
	//4.생성된 배열 보여주기
	public static void showScores(double[] scoreArray) {
		for(int i=0; i<scoreArray.length; i++) {
			System.out.printf("학생%d 점수: %.2f점\n", i+1, scoreArray[i]);
		}

	}

}//class

