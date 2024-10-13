import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class ThreeSum{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of array : ");
			int size;
			while (true) {
				size = getValidInput(sc);
				if(size > 0) break;
				System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			}
			int arr[] = new int[size];
			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);

			System.out.println("\nResulted Array : "+Arrays.toString(arr));

			System.out.print("\nEnter the target sum : ");
			int targetSum = getValidInput(sc);

			int threeSum[] = findThreeSum(arr,targetSum);

			if(threeSum[0] != -1 && threeSum[1] != -1 && threeSum[2] != -1)

			System.out.println("\nThree Indicies Are : "+Arrays.toString(threeSum));

		    else System.out.println("\nNo Three Indicies Are Equal To Target Sum.");

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
				System.out.println("\nInvalid input!please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static int[] findThreeSum(int arr[],int targetSum){

		for (int i = 0 ; i < arr.length - 2 ; ++i) {
			
			for (int j = i+1 ; j < arr.length - 1 ; ++j) {
				
				for (int k = j + 1; k < arr.length ; ++k) {
					
					if(arr[i] + arr[j] + arr[k] == targetSum) return new int[]{i,j,k};
				}
			}
		}

		return new int[]{-1,-1,-1};
	}
}