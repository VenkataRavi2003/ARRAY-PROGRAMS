import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class RemoveDuplicatesFromSortedArray{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");

		int size = getValidInput(sc);

		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(a,sc);

		Arrays.sort(a);

		System.out.println("\nBefore Removing Duplicates : ");
		printArray(a);

		int res[] = removeDuplicates(a);

		System.out.println("\nAfter Removing Duplicates : ");
		printArray(res);

	}
	public static int getValidInput(Scanner sc){

		while (true) {
			
			try{
				int input = sc.nextInt();

				if(input > 0){

					return input;
				}else{

					System.out.println("\nArray Size Must Be Greater Than Zero!!");
					
				}
			}catch(InputMismatchException ie){

				System.out.println("\nInvalid Input, Please Enter An Integer As Input.");
				sc.next();
			}
		}
	}
	public static void takeInput(int a[],Scanner sc){

		for (int i = 0 ;i < a.length ; ++i) {
			 a[i] = sc.nextInt();
		}
	}
	public static void printArray(int a[]){
		for (int item : a) {		
			System.out.print(item+" ");
		}
	}
	public static int[] removeDuplicates(int a[]){

		if(a.length == 0 || a.length == 1){// No duplicates to remove for array of size 0 or 1
			return a;
		}

		int res[] = new int[a.length];

		int index = 0;

		for (int i = 0 ; i < a.length -1; ++i) {
			
			if(a[i] != a[i+1]){// If current element is not equal to next element, it's not a duplicate

				res[index++] = a[i];
			}
		}

		res[index++] = a[a.length-1]; //adding last element.

		// Creating a new array of size index (number of unique elements)
		int result[] = Arrays.copyOf(res,index);
		return result;
	}
}