import java.util.Scanner;
import java.util.Arrays;
public class MedianOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greter than zero!!");
			sc.close();
			return;
		}

		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(a,sc);

		Arrays.sort(a); // to find median , we have to sort the array.

		System.out.println("\nResulted Array After Sorting : ");
		printArray(a);

		float median = findMedian(a);

		System.out.println("\nMedian : "+median);

		sc.close();
	}
	public static void takeInput(int a[],Scanner sc){
		for (int i = 0 ; i < a.length ; ++i) {
			a[i] = sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a) {
			System.out.print(item+" ");
		}
	}
	public static float findMedian(int a[]){
		if(a.length % 2 != 0){

			return a[a.length / 2];
		}
		float sum = a[a.length / 2 ] + a[(a.length / 2 ) - 1];

		return sum / 2 ;
	}
}