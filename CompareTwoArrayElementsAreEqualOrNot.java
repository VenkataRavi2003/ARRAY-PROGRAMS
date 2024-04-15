import java.util.Scanner;
import java.util.Arrays;
public class CompareTwoArrayElementsAreEqualOrNot{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter 1st array size : ");
		int size1 = sc.nextInt();

		if(size1 <= 0){
			System.out.println("\n"+size1+" -> Array size must greater than zero !!");
			sc.close();
			return;
		}

		int arr1[] = new int[size1];

		System.out.println("\nEnter the 1st array elements : ");
		takeInput(sc,arr1);

		System.out.println("\n1st Array :");
		printArray(arr1);

		System.out.print("\nEnter 2nd array size : ");
		int size2 = sc.nextInt();

		if(size2 <= 0){
			System.out.println("\n"+size2+" -> Array size must greater than zero !!");
			sc.close();
			return;
		}

		int arr2[] = new int[size2];

		System.out.println("\nEnter the 2nd array elements : ");
		takeInput(sc,arr2);

		System.out.println("\n2nd Array :");
		printArray(arr2);

		if(isTwoArraysEqualElements(arr1,arr2)){
			System.out.println("\nBoth Arrays Has Same Elements.");
		}else{
			System.out.println("\nBoth Arrays Are Not Equal !!");
		}

		sc.close();
	}
	public static void takeInput(Scanner sc, int arr[]){

		for (int i = 0 ; i < arr.length ; ++i) {
			
			 arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){

		for (int item : arr ) {
			
			 System.out.print(item+" ");
		}
	}
	public static boolean isTwoArraysEqualElements(int arr1[] , int arr2[]){

		if(arr1.length != arr2.length)return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length ; ++i) {

			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
}