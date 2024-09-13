import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class FrequencyOfAllElementsInArray{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);
			System.out.println("\nResulted Array : \n"+Arrays.toString(arr));

			findFrequenciesOfAllElements(arr);
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static void findFrequenciesOfAllElements(int arr[]){

		for (int i = 0 ; i < arr.length; ++i) {

			if(arr[i] == -1) continue;

			int count = 1;
			
			for (int j = i + 1; j < arr.length ; ++j) {
				
				if(arr[i] == arr[j]){
					++count;
					arr[j] = -1;
				}
			}

			System.out.println("\n"+arr[i]+" -> Frequency Is : "+count);
		}
	}
}