//240111 multidimensional array
package sec01;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		int [] [] scores = { {95, 80}, {92, 96}, {100,100,100} };
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
	}

}
