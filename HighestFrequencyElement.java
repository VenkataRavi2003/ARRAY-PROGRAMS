import java.util.Scanner;
import java.util.InputMismatchException;
public class HighestFrequencyElement{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int size;
			while (true) {
				System.out.print("\nEnter the size of array : ");
				size = sc.nextInt();
				if(size > 0) break;
				System.out.println("\n"+size+" -> size must be greater than zero!!");
			}
			int arr[] = new int[size];
			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);

			System.out.print("\nResulted Array : ");
			printArray(arr);

			int highestFreqElement = findHighestFreqElement(arr);

			if(highestFreqElement != -1){
				System.out.println("\nHighest Frequency Element -> "+highestFreqElement);
			}else {
				System.out.println("\nNot found!!");
			}
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = getValidInput(sc);
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input!!please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	public static int findHighestFreqElement(int arr[]){
		int highestFreqElement = -1;
		int maxCount = 0;
		for (int i = 0; i < arr.length ; ++i) {
			if(arr[i] == -1)continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; ++j) {
				if(arr[i] == arr[j]){
					++count;
					arr[j] = -1;
				}
			}
			if(maxCount < count){
				maxCount = count;
				highestFreqElement = arr[i];
			}
		}
		return (maxCount == 1) ? -1 : highestFreqElement; 
	}
}