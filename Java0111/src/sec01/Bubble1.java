//240111 Bubble Sort: Ascending Order
package sec01;


public class Bubble1 {
	
	public static void main(String[] args) {

		int[] arr = new int[] {7, 0, -5, 10, 3, -10, 1, 4, 2};
		
//실제로는 Arrays.sort() 이용
		//		Arrays.sort(arr);

//내 코드: Selection Sort		
	//		for(int i = 0; i<arr.length; i++) {
	//			for(int j=i+1; j<arr.length; j++) {
	//				if(arr[i]>arr[j]) {
	//					int temp = arr[j];
	//					arr[j] = arr[i];
	//					arr[i] = temp;
	//				}
	//				System.out.print("intermediate ");
	//				printArray(arr);
	//			}
	//		}//for
	//		System.out.print("final ");
	//		printArray(arr);
		
//Bubble Sort		
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("intermediate ");
            printArray(arr);
        }

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
