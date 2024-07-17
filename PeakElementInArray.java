import java.util.Scanner;
import java.util.InputMismatchException;
public class PeakElementInArray{

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			if(size <= 0){
				System.out.println("\n"+size+" -> Array size must be greater than zero!!");
				return;
			}

			int arr[] = new int[size];

			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);

			System.out.println("\nResulted Array : ");
			printArray(arr);

			int peakElementIndex = findPeakElementIndex(arr);

			if(peakElementIndex != -1){
				System.out.println("\nPeak Element Present At : "+peakElementIndex+" Index.");
			}else {
				System.out.println("\nNo Peak Element Present In Array!!");
			}

		}catch (InputMismatchException ime) {
			System.out.println("\nInputMismatchException Occured :: "+ime.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static int findPeakElementIndex(int arr[]){

		if(arr.length == 1) return 0;

		if(arr[0] >= arr[1]) return 0;

		if(arr[arr.length - 1] >= arr[arr.length - 2]) return arr.length - 1;

		for (int i = 1 ; i < arr.length - 1 ; ++i) {
			
			if(arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){

				return i;
			}
		}

		return -1;
	}
}