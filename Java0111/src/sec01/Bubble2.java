//240111 Bubble Sort: Descending Order
package sec01;



public class Bubble2 {
	
	public static void main(String[] args) {
	
//실제로는 Arrays.sort() 이용
//		Arrays.sort(arr);

		int[] arr = new int[] {7, 0, -5, 10, 3, -10, 1, 4, 2};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=arr.length-1; j>i; j--) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				System.out.print("intermediate ");
				printArray(arr);
			}
		}//for
		System.out.print("final ");
		printArray(arr);
	}//main

	public static void printArray(int[] arr) {
		for(int number: arr) {
			System.out.printf("%d ", number);
		}
		System.out.println();
	}
	
}
