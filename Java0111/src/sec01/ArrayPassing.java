//240111 call by value, call by reference
package sec01;

public class ArrayPassing {

	public static void increase(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		increase(a);
		for (int n: a) {
			System.out.println(n);
		}
	}

}
