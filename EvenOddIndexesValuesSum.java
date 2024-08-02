import java.util.Scanner;
import java.util.InputMismatchException;
public class EvenOddIndexesValuesSum{
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

			findEvenOddIndexValuesSums(arr);

		}catch (InputMismatchException e) {
			System.out.println("\nInputMismatchException Occured :: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occrured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc)throws InputMismatchException{
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static void findEvenOddIndexValuesSums(int arr[]){
		int evenIndiciesSum = 0 ,oddIndiciesSum = 0;

		for (int i = 0 ; i < arr.length ; ++i) {
			if(i % 2 == 0){
				evenIndiciesSum += arr[i];
			}else {
				oddIndiciesSum += arr[i];
			}
		}
		System.out.println("\nEven Indexes Sum  : "+evenIndiciesSum);
		System.out.println("\nOdd  Indexes Sum  : "+oddIndiciesSum);
	}
}