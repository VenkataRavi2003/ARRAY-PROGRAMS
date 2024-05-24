import java.util.Scanner;
import java.util.Arrays;
public class BinarySearching1{
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			// Get a valid size for the array
			int size = getValidSize(sc);

			int arr[] = new int[size];

			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);

			// Sort the array for binary search
			Arrays.sort(arr); 

			System.out.println("\nResulted Array After Sorting :: \n");
			printArray(arr);

			System.out.print("\nEnter the element need to search ->  ");
			int targetElement = sc.nextInt();

			int index = binarySearch(arr,targetElement);

			if(index != -1){
				System.out.println("\n"+targetElement+" : present at -> "+index+".");
			}else{
				System.out.println("\n"+targetElement+" -> Not Found!!");
			}

		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("\nException Occured :: "+ae.getMessage());
			
		}catch (NumberFormatException ne) {
			System.out.println("\nException Occured :: "+ne.getMessage());
			
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	// Method to get a valid size for the array
	public static int getValidSize(Scanner sc)throws Exception{

		while (true) {
			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			if(size > 0){
				return size;
			}else{
				System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			}
		}
	}
	// Method to take input for the array
	public static void takeInput(int arr[],Scanner sc)throws Exception{

		for (int i = 0 ; i < arr.length ; ++i) {
			
			arr[i] = sc.nextInt();
		}
	}
	// Method to print the array
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	// Method to perform binary search
	public static int binarySearch(int arr[],int targetElement){

		int start = 0 , end = arr.length - 1 , mid = -1;

		while (start <= end) {
			
			mid = (start + end) / 2;

			if(arr[mid] == targetElement){
				return mid;
			}else if (arr[mid] < targetElement) {
				start = mid + 1;
			}else{

				end = mid - 1;
			}
		}

		return -1;
	}

}