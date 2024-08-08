import java.util.Scanner;
import java.util.Arrays;
public class TwoSum{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			if(size <= 0){
				System.out.println("\n"+size+" -> array size must be greater than zero!!");
				return;
			}

			int arr[] = new int[size];

			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);

			System.out.println("\nResulted Array : \n"+Arrays.toString(arr));

			System.out.print("\nEnter the target sum -> ");
			int targetSum = sc.nextInt();

			int result[] = findTwoSum(arr,targetSum);
			
			if (result[0] == -1 && result[1] == -1) {
                System.out.println("\nNo two sum solution found.");
            } else {
                System.out.println("\nTwo Indices Are: " + result[0] + " & " + result[1]);
            }

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = sc.nextInt();
		}
	}
	public static int[] findTwoSum(int arr[],int targetSum){

		for (int i = 0 ; i < arr.length ; ++i) {
			for (int j = i + 1 ; j < arr.length ; ++j) {
				
				if(arr[i] + arr[j] == targetSum){

					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}
}
