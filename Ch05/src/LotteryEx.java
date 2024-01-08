//240108 향상된 for문(index를 쓰지 않는 경우에 사용한다)
import java.util.Random;

public class LotteryEx {

	public static void main(String[] args) {
		int[] lottery = new int[6];
		Random random = new Random();

		for(int i=0 ; i<lottery.length ; i++) {
			lottery[i] = random.nextInt(45)+1;
			System.out.println(lottery[i]);
		}
		
		System.out.println("=".repeat(10));
		
		for(int value: lottery) {
			System.out.println(value);
		}
	}

}
