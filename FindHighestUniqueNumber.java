import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class FindHighestUniqueNumber{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			int size;
			while (true) {
				
				System.out.print("\nEnter the size of array : ");
				size = sc.nextInt();

				if(size > 0)break;

				System.out.println("\n"+size+" -> size must be greater than zero!!");
			}

			int arr[] = new int[size];

			System.out.println("\nEnter the elements : ");
			takeInput(arr,size,sc);

			System.out.println("\nResulted Array : \n");
			printArray(arr);

			int highestUniqueNumber = findHighestUniqueNum(arr);

			if(highestUniqueNumber != -1){
				System.out.println("\nHighest unique -> "+highestUniqueNumber);
			}else {
				System.out.println("\nNo Highest unique number found!!");
			}
		}
	}
	public static void takeInput(int arr[],int size,Scanner sc){

		for (int i = 0; i < size ; ++i) {
			arr[i] = getValidInput(sc);
		}
	}
	public static int getValidInput(Scanner sc){

		while(true){
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
	public static int findHighestUniqueNum(int arr[]){

		for (int i = 0 ; i < arr.length - 1 ; ++i) {
			
			if(arr[i] == -1)continue;

			for (int j = i + 1; j < arr.length ; ++j) {
				
				if(arr[i] == arr[j]){

					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}

		Arrays.sort(arr);

		if(arr[arr.length - 1] != -1){
			return arr[arr.length - 1];
		}

		return -1;
	}
}