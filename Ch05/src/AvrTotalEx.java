//240108 Array and Total, Average
//type promotion and casting
public class AvrTotalEx {

	public static void main(String[] args) {
		double[] array = new double[] {83.6,90,87.2};
		
		double sum = 0;
		for(double score: array) {
			sum += score;
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (sum/array.length));
		
//		(double)(sum/array.length) // doesn't work
//		((double)sum/array.length) // works
//		(sum/(double)array.length) // works

	}

}
