import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class MedianOfTwoSortedArrays{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter 1st array size : ");
			int size1 = sc.nextInt();
			System.out.print("\nEnter 2nd array size : ");
			int size2 = sc.nextInt();

			if(size1 <= 0 || size2 <= 0){
				System.out.println("\nArray sizes must be greater than zero!!");
				return;
			}
			int arr1[] = new int[size1];
			int arr2[] = new int[size2];

			System.out.println("\nEnter 1st array elements : ");
			takeInput(arr1,sc);
			System.out.println("\nEnter 2nd array elements : ");
			takeInput(arr2,sc);

			System.out.println("\n1st array :: \n"+Arrays.toString(arr1));
			System.out.println("\n2nd array :: \n"+Arrays.toString(arr2));

			int sortedMergedArray[] = mergedTwoArrays(arr1,arr2);

			System.out.println("\nSorted Merged Array : \n"+Arrays.toString(sortedMergedArray));

			double median  = findMedianSortedArrays(sortedMergedArray);

			System.out.println("\nMedian Of Two Sorted Arrays : "+median);

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for(int i = 0 ; i < arr.length ; ++i){
			arr[i] = getValidInput(sc);
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input! please enter valid integer as input.");
			}
		}
	}
	public static int[] mergedTwoArrays(int arr1[],int arr2[]){

		int mergedArray[] = new int[arr1.length + arr2.length];
		int index = 0;

		for (int item : arr1) {
			mergedArray[index++] = item;
		}
		for (int item : arr2) {
			mergedArray[index++] = item;
		}

		Arrays.sort(mergedArray);

		return mergedArray;
	}
	public static double findMedianSortedArrays(int mergedArray[]){

		int n = mergedArray.length;

		if(n % 2 != 0){
			return mergedArray[n/2];
		}

		double sum = mergedArray[(n/2) - 1] + mergedArray[n / 2];

		return sum / 2;
	}
}